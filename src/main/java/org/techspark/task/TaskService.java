package org.techspark.task;

import org.techspark.task.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> getTasks();
    Task createTask(Task task);
    Optional<Task> getTask(Long id);
    Task updateTask(Long id, Task updatedTask);
    void deleteTask(Long id);
}
