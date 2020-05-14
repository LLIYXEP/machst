package scurtu.machst.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import scurtu.machst.domain.Task;
import scurtu.machst.repo.TaskRepo;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("task")
public class TaskController {

  private final TaskRepo taskRepo;

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
  public void uploadImage(@RequestParam String file) {
    System.out.println("Hello world");
    System.out.println(file);
    String[] split = file.split(",");
    String base64Img = split[1];
    System.out.println(split[1]);

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
