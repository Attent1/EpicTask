package br.com.fiap.epictaska.task;

import br.com.fiap.epictaska.user.User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task create(Task task) {
        return taskRepository.save(task);
    }

    public void delete(UUID id) {
        taskRepository.deleteById(id);
    }

    public void catchTask(UUID id, User user) {
        var task = taskRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Task not found!")
        );
        task.setUser(user);
        taskRepository.save(task);
    }

    public void releaseTask(UUID id, User principal) {
        var task = taskRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Task not found!")
        );
        task.setUser(null);
        taskRepository.save(task);
    }

    public void incTask(UUID id, User principal) {
        var task = taskRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Task not found!")
        );
        task.setStatus(task.getStatus() + 10);
        taskRepository.save(task);
    }

    public void decTask(UUID id, User principal) {
        var task = taskRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Task not found!")
        );
        task.setStatus(task.getStatus() - 10);
        taskRepository.save(task);
    }
}
