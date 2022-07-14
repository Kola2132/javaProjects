import java.util.ArrayList;

public class Todo {
    ArrayList<Task> todo = new ArrayList<>();

    public void addTask(Task task) {
        todo.add(task);
    }

    public void print() {
        for (int i = 0; i < todo.size(); i++)
            todo.get(i).print();
    }
}
