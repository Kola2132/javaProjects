import java.util.UUID;

public class Task {
    String ID;
    String name;
    TaskStatus status;

    Task(String name) {
        this.ID = UUID.randomUUID().toString();
        ;
        this.name = name;
        this.status = TaskStatus.NEW;
    }

    public void setStatus(TaskStatus taskStatus) {
        this.status = taskStatus;
    }

    public void editName(String newName) {
        this.name = newName;
    }

    public void print() {
        System.out.println(this.ID + ": " + this.name + " (Status: " + this.status + ")");
    }
}
