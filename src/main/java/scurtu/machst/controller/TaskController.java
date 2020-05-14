package scurtu.machst.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scurtu.machst.domain.Task;
import scurtu.machst.repo.TaskRepo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("task")
public class TaskController {

  private final TaskRepo taskRepo;

  @Value("${upload.path}")
  private String uploadPath;

  @Autowired
  public TaskController(TaskRepo taskRepo) {
    this.taskRepo = taskRepo;
  }

  @GetMapping
  public List<Task> list() {
    return taskRepo.findAll();
  }

  @GetMapping("{id}")
  public Task getOne(@PathVariable("id") Task task) {
    return task;
  }

  @CrossOrigin
  @PostMapping("/image")
  @ResponseBody
  public void uploadImage(@RequestParam String file) throws IOException {
    System.out.println("Hello world");
    System.out.println(file);
    String[] split = file.split(",");
    String base64Img = split[1];
    System.out.println(split[1]);

    try
    {
      //This will decode the String which is encoded by using Base64 class
      byte[] decodedImgInBytes = Base64.getDecoder().decode(base64Img);

//      String directory = "/images/sample.jpg";
      File uploadDir = new File(uploadPath);
      if (!uploadDir.exists()) {
        uploadDir.mkdir();
      }

      String uuidFile = UUID.randomUUID().toString();
      String resultFilename = uuidFile + ".jpg";
      File fileNew = new File(uploadPath + "/" + resultFilename);
      String directory = uploadPath + "/" + resultFilename;

      FileOutputStream outputStream = new FileOutputStream(directory);
      outputStream.write(decodedImgInBytes);
      outputStream.flush();
      outputStream.close();
      System.out.println("gut");
    }
    catch(Exception e)
    {
      System.out.println("error");
    }


  }

  @PostMapping
  public Task create(@RequestBody Task task) {
    task.setCreationDate(LocalDateTime.now());
    task.setStatus(1);
    return taskRepo.save(task);
  }

  @PutMapping("{id}")
  public Task update(
    @PathVariable("id") Task taskFromDB,
    @RequestBody Task task) {

    BeanUtils.copyProperties(task, taskFromDB, "id");

    return  taskRepo.save(task);
  }

  @DeleteMapping("{id}")
  public void remove(@PathVariable("id") Task task) {
    taskRepo.delete(task);
  }
}
