import java.util.ArrayList;

public class Todo {
    ArrayList<Task> todo = new ArrayList<>();

    Todo() {
        this.todo = new ArrayList();
    }

    public void addTask(Task task) {
        this.todo.add(task);
    }

    public void print() {
        for (Task taskInList : this.todo) {
            taskInList.print();
        }
    }
}
