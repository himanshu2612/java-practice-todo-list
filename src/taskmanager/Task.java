package taskmanager;
import java.lang.reflect.Array;
import java.util.UUID;

public class Task {
    private String id;
    private String name;
    private String description;
    private String[] tags;

    private TaskStatus status;

    public Task(String name, String description, String[] tags) {
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.id = UUID.randomUUID().toString();
        this.status = TaskStatus.TODO;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
