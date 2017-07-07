
package com.iqmsoft.osgi.aries.karaf.model;

import java.util.Collection;

public interface TaskService {
    Task getTask(Integer id);
    void addTask(Task task);
    void updateTask(Task task);
    void deleteTask(Integer id);
    Collection<Task> getTasks();
}
