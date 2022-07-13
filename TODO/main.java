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
    static List list;

    public static void TODO() {
        System.out.println("\nTODO");
        System.out.println("~ TODO ADD - create new task");
        System.out.println("~ TODO LIST - show my tasks");
        System.out.println("~ TODO MARK id STATUS - change status (NEW, ACTIVE, DONE)");
        System.out.println("~ TODO EDIT id 'new name' - change name of existing task");
        System.out.println("~ TODO DELETE id - remove task from list");
        System.out.println("~ EXIT - End program");
    }

    public static void main(String[] args) {
        TODO();
        list.add("TODO ADD kamyk");
        // list.getList();
        // list.mark("TODO MARK 1 DONE");
        // list.getList();
        if (1 == 2) {
            // String tasks = "";
            // int ID = 1;
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Type 'TODO' to show list of Commands");
            // while (!tasks.equals("EXIT")) {
            // tasks = sc.nextLine();
            // if (tasks.equals("EXIT"))
            // break;
            // if (!tasks.startsWith(TODO))
            // continue;
            // if (tasks.equals(TODO)) {
            // TODO();
            // }
            // if (tasks.startsWith(ADD)) {
            // ID = list.add(ID, tasks);
            // }
            // if (tasks.equals(LIST)) {
            // list.getList();
            // }
            // if (tasks.startsWith(MARK)) {
            // list.mark(tasks);
            // }
            // if (tasks.startsWith(EDIT)) {
            // list.edit(tasks);
            // }
            // if (tasks.startsWith(DELETE)) {
            // ID = list.delete(ID, tasks);
            // }
            // }
            // sc.close();
        }
    }
}
