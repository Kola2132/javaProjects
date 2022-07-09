import java.security.IdentityScope;
import java.util.Scanner;

import org.omg.CORBA.portable.IDLEntity;

public class main {
    static String EDIT = "TODO EDIT";
    static String DELETE = "TODO DELETE";
    static String MARK = "TODO MARK";
    static String LIST = "TODO LIST";
    static String ADD = "TODO ADD";
    static String TODO = "TODO";
    static Task[] list = new Task[100];

    public static void TODO() {
        System.out.println("\nTODO");
        System.out.println("~ TODO ADD - create new task");
        System.out.println("~ TODO LIST - show my tasks");
        System.out.println("~ TODO MARK id STATUS - change status (NEW, ACTIVE, DONE)");
        System.out.println("~ TODO EDIT id 'new name' - change name of existing task");
        System.out.println("~ TODO DELETE id - remove task from list");
        System.out.println("~ EXIT - End program");
    }

    public static int add(int ID, String tasks) {
        list[ID] = new Task(ID, tasks.substring(9));
        System.out.println("Task " + tasks.substring(9) + " added successfully");
        ID++;
        return ID;

    }

    public static void list(int ID) {
        for (int i = 1; i < ID; i++)
            System.out.println("\n~ " + list[i].ID + ". " + list[i].name + " " + list[i].status);

    }

    public static void mark(String tasks) {
        String[] temp = tasks.split(" ");
        list[Integer.parseInt(temp[2])].status = temp[3];
        System.out.println("Task with ID " + temp[2] + " was marked successfully as " + temp[3]);
    }

    public static void edit(String tasks) {
        String[] temp = tasks.split(" ", 4);
        list[Integer.parseInt(temp[2])].name = temp[3];
        System.out.println("Task with ID " + temp[2] + " was edited successfully into " + temp[3]);
    }

    public static int delete(int ID, String tasks) {
        String[] temp = tasks.split(" ");
        if (ID >= 2) {
            ID = ID - 1;
            if (ID > 2) {
                String pom1 = list[ID - 1].name;
                String pom2 = list[ID - 1].status;
                list[ID - 1].name = list[ID].name;
                list[ID - 1].status = list[ID].status;
                for (int i = ID - 1; i > Integer.parseInt(temp[2]); i--) {
                    String pom3 = pom1;
                    String pom4 = pom2;
                    pom1 = list[i - 1].name;
                    pom2 = list[i - 1].status;
                    list[i - 1].name = pom3;
                    list[i - 1].status = pom4;
                    ;
                }
            }
            list[ID].name = "";
            list[ID].status = "";
            System.out.println("Task with ID " + ID + " was deleted successfully");
        }

        return ID;
    }

    public static void main(String[] args) {
        String tasks = "";
        int ID = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 'TODO' to show list of Commands");
        while (!tasks.equals("EXIT")) {
            tasks = sc.nextLine();
            if (tasks.equals("EXIT"))
                break;
            if (!tasks.startsWith(TODO))
                continue;
            if (tasks.equals(TODO)) {
                TODO();
            }
            if (tasks.startsWith(ADD)) {
                ID = add(ID, tasks);
            }
            if (tasks.equals(LIST)) {
                list(ID);
            }
            if (tasks.startsWith(MARK)) {
                mark(tasks);
            }
            if (tasks.startsWith(EDIT)) {
                edit(tasks);
            }
            if (tasks.startsWith(DELETE)) {
                ID = delete(ID, tasks);
            }
        }
        sc.close();
    }
}
