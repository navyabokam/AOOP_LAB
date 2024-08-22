import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    // Add a task to the list
    public void addTask(String task) {
        tasks.add(task);
    }

    // Update a task's description by its index
    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
        } else {
            System.out.println("Task not found.");
        }
    }

    // Remove a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Task not found.");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        toDoList.addTask("Complete the project report");
        toDoList.addTask("Prepare for the meeting");
        toDoList.addTask("Buy groceries");

        System.out.println("Tasks after adding:");
        toDoList.displayTasks();

        toDoList.updateTask(1, "Prepare for the client meeting");

        System.out.println("\nTasks after updating:");
        toDoList.displayTasks();

        toDoList.removeTask(2);

        System.out.println("\nTasks after removing:");
        toDoList.displayTasks();
    }
}
