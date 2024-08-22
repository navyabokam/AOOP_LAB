import java.util.*;
public class TaskManagementSystem {
    private ArrayList<String> tasks;
    public TaskManagementSystem() {
        tasks=new ArrayList<>();
    }
    public void addTasks(String task){
        tasks.add(task);
        System.out.println("Tasks added successfully!");
    }
    public void updateTasks(int position,String newdescription){
        if(position>=0&&position<tasks.size()){
            tasks.set(position,newdescription);
            System.out.println("Tasks updated successfully!");
        }
        else{
            System.out.println("Invalid position");
        }
    }
    public void removeTasks(int position){
        if(position>=0 && position<tasks.size()){
            tasks.remove(position);
            System.out.println("removed successfully!");
        }
        else{
            System.out.println("Position invalid");
        }
    }
    public void displayTasks(){
        if(tasks.isEmpty()){
            System.out.println("List is Empty");
        }
        else{
            for(int i=0;i< tasks.size();i++){
                System.out.println((i+1)+". "+tasks.get(i));
            }
        }
    }
    public static void main(String[] args) {
        TaskManagementSystem taskManager =new TaskManagementSystem();
        Scanner sc= new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n Task Management System");
            System.out.println("1.Add task");
            System.out.println("2.Update task");
            System.out.println("3.remove task");
            System.out.println("4.Display tasks");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter task description");
                    String task =sc.nextLine();
                    taskManager.addTasks(task);
                    break;
                case 2:
                    System.out.println("Enter position to update");
                    int newPosition =sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Description");
                    String newDescription=sc.nextLine();
                    taskManager.updateTasks(newPosition-1,newDescription);
                    break;
                case 3:
                    System.out.print("Enter task position to remove: ");
                    int removePosition = sc.nextInt();
                    taskManager.removeTasks(removePosition - 1); // Convert to 0-based index
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting Task Management System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }

}
