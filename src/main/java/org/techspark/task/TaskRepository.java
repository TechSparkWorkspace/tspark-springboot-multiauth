package org.techspark.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techspark.task.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
