import java.time.LocalDateTime;

public class Task {

    int id;
    String title;
    String description;
    Priority priority;
    Status status;
    String createdTime;

    public Task(int id, String title, String description,
                Priority priority, Status status) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;

        this.createdTime = LocalDateTime.now()
                .format(Constant.TASK_DATE_FORMATTER);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nTitle: " + title +
                "\nDescription: " + description +
                "\nPriority: " + priority +
                "\nStatus: " + status +
                "\nCreated Time: " + createdTime +
                "\n";
    }
}