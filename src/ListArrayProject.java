import java.util.ArrayList;
import java.util.Scanner;
public class ListArrayProject
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        boolean isExit = true;
        while (isExit)
        {
            System.out.println("---Menu---");
            System.out.println("1:---Add Task---");
            System.out.println("2:---View Task---");
            System.out.println("3:---Remove Task---");
            System.out.println("4:---Exit---");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter Task = ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added");
            }
        }
    }
}
// rename isTrue - readable code