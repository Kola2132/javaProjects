import java.util.ArrayList;

public class List {
    ArrayList<Task> list = new ArrayList<>();
    int ID = 1;

    public void getList() {
        for (int i = 1; i <= list.size(); i++)
            System.out.println("\n~ " + list.get(i).ID + ". " + list.get(i).name + " " + list.get(i).status);

    }

    public void add(String tasks) {
        list.add(new Task(ID, tasks.substring(9)));
        ID++;
    }

    public void mark(String tasks) {
        String[] temp = tasks.split(" ");
        list.get(Integer.parseInt(temp[2])).status = temp[3];
        System.out.println("Task with ID " + temp[2] + " was marked successfully as " + temp[3]);
    }

    public int delete(String tasks) {
        String[] temp = tasks.split(" ");
        if (ID >= 2) {
            ID = ID - 1;
            if (ID > 2) {
                String pom1 = list.get(ID - 1).name;
                String pom2 = list.get(ID - 1).status;
                list.get(ID - 1).name = list.get(ID).name;
                list.get(ID - 1).status = list.get(ID).status;
                for (int i = ID - 1; i > Integer.parseInt(temp[2]); i--) {
                    String pom3 = pom1;
                    String pom4 = pom2;
                    pom1 = list.get(ID - 1).name;
                    pom2 = list.get(ID - 1).status;
                    list.get(ID - 1).name = pom3;
                    list.get(ID - 1).status = pom4;
                    ;
                }
            }
            list.get(ID).name = "";
            list.get(ID).status = "";
            System.out.println("Task with ID " + ID + " was deleted successfully");
        }

        return ID;
    }

    public void edit(String tasks) {
        String[] temp = tasks.split(" ", 4);
        list.get(Integer.parseInt(temp[2])).name = temp[3];
        System.out.println("Task with ID " + temp[2] + " was edited successfully into " + temp[3]);
    }
}
