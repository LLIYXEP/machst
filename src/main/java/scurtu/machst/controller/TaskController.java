package scurtu.machst.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scurtu.machst.domain.Task;
import scurtu.machst.repo.TaskRepo;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tasks-list")
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

  @PostMapping
  public Task create(@RequestBody Task task) {


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
