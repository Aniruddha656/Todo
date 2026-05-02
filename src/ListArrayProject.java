import java.util.ArrayList;
import java.util.Scanner;
public class ListArrayProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean isExit = true;
        while (isExit) {
            System.out.println("---Menu---");
            System.out.println("1:---Add Task---");
            System.out.println("2:---View Task---");
            System.out.println("3:---Remove Task---");
            System.out.println("4:---Exit---");
            System.out.println("Which operation do U want to perform?");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Task = ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("list is empty");
                    } else {
                        System.out.println("Your tasks => ");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter number of task which you want to delete");
                    int index = sc.nextInt();
                    index = index - 1;
                    if (index < 0 || index > tasks.size()) {
                        System.out.println("Invalid Input");
                    }
                    tasks.remove(index);
                    System.out.println("Task is deleted");
                    break;
                case 4:
                    isExit = false;
                    System.out.println("Thanks for using our app");
                    break;
                default:
                    System.out.println("Invalid output");
            }
        }
    }
}