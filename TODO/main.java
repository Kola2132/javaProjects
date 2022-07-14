public class main {
    public static void main(String[] args) {
        Todo todo = new Todo();
        // todo.list is ArrayList<Task>;

        // todo.addTask();
        // todo.print();

        Task task1 = new Task("Task1");
        Task task2 = new Task("Task2");
        Task task3 = new Task("Task3");
        Task task4 = new Task("Task4");

        // task will create with status NEW and unique id;

        todo.addTask(task1);
        todo.addTask(task2);
        todo.addTask(task3);
        todo.addTask(task4);
        // task1 will be added to todo.list;

        task1.setStatus(TaskStatus.DONE);
        // task1 will be set status ACTIVE;

        todo.print(); // prints: 1: asdasdasd (ACTIVE)
        // todo.print will run task.print() for every task in todo.list;

    }
}

// Stworzenie instancji klasy Todo

// Stworzenie instancji klasy Task

// Doodanie do Todo instancji klasy Task

// zmiana statusu Taska1 na ACTIVE