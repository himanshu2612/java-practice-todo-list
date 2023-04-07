package taskmanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<Task>();
    }

    public ArrayList<Task> getTasks() {`
        return tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public  boolean removeTask(String id) {
        Iterator itr = tasks.iterator();
        while (itr.hasNext()) {
            Task task = (Task) itr.next();
            if (Objects.equals(task.getId(), id)) {
                itr.remove();
                return true;
            }
        }
        return false;
    }

    public boolean changeStatus(String id, TaskStatus status) {
        Task task  = null;
        for(Task curTask: this.tasks){
            if(Objects.equals(curTask.getId(), id)){
                task = curTask;
                break;
            }
        }

        if(task == null){
            return false;
        }

        if(status == TaskStatus.COMPLETED){
            this.removeTask(id);
            return true;
        }

        task.setStatus(status);

        return true;
    }
}
