import taskmanager.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void printTasks(ArrayList<Task> tasks){
        for(Task task: tasks){
            System.out.println(task.getName());
        }
    }

    public static void main(String[] args) {
        TaskList tasks = new TaskList();
        String[] tags1 = new String[]{"code"};
        Task task1  = new Task("task1", "hello mys task", tags1);
        Task task2  = new Task("task2", "hello mys task2", tags1);

        tasks.addTask(task1);
        tasks.addTask(task2);

        printTasks(tasks.getTasks());

        tasks.removeTask(task1.getId());

        printTasks(tasks.getTasks());
    }
}
