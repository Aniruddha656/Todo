import java.util.ArrayList;
import java.util.Scanner;
public class ListArrayProject {
    public static void main(String[] args) {
        int nextId = 1; // Todo: use AtomicInteger
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("---Menu---");
            System.out.println("1:---Add Task---");
            System.out.println("2:---View Task---");
            System.out.println("3:---Remove Task---");
            System.out.println("4:---Exit---");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    sc.nextLine();

                    int id = nextId++;

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter Priority (HIGH/MEDIUM/LOW): ");
                    String priority = sc.nextLine().trim();

                    if (priority.isEmpty()) {
                        priority = "LOW";
                    }

                    String status = "PENDING";

                    Task task = new Task(
                            id,
                            title,
                            description,
                            priority,
                            status
                    );

                    tasks.add(task);

                    System.out.println("Task Added Successfully");
                    break;
                case 2:

                    if (tasks.isEmpty()) {
                        System.out.println("No tasks found");
                    } else {

                        for (Task t : tasks) {
                            System.out.println(t);
                        }
                    }
                    break;
                case 3:

                    System.out.print("Enter task ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < tasks.size(); i++) {

                        if (tasks.get(i).id == deleteId) {

                            tasks.remove(i);
                            found = true;
                            System.out.println("Task Deleted");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Task ID not found");
                    }

                    break;
                case 4:
                    isTrue = false;
                    System.out.println("Thanks for using our app");
                    break;
                default:
                    System.out.println("Invalid output");
            }
        }
    }
}