public class Task {
    int ID;
    String name;
    TaskStatus status;
    int pom = 1;

    Task(String name) {
        this.ID = pom;
        this.name = name;
        this.status = TaskStatus.NEW;
        pom++;
    }

    public void setStatus(TaskStatus taskStatus) {
        status = taskStatus;
    }

    public void editName(String newName) {
        name = newName;
    }

    public void print() {
        System.out.println(ID + ": " + name + " (Status: " + status + ")");
    }
}
