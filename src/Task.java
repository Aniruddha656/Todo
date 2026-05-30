import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    public class Task {
        int id;
        String title;
        String description;
        String priority;
        String status;
        String createdTime;

        public Task(int id, String title, String description,
                    String priority, String status) {

            this.id = id;
            this.title = title;
            this.description = description;
            this.priority = priority;
            this.status = status;
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            this.createdTime = LocalDateTime.now().format(formatter);
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
