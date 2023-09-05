import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    Scanner sc = new Scanner(System.in);

    /**
     * this will add a task to the ToDo list arryList
     * @param todoList this is the ArryList which contains the ToDo List
     */
    public void addTask(ArrayList<StringBuilder> todoList) {
        System.out.println("Enter Your Task:");
        String workString = "[]" + sc.nextLine();
        StringBuilder work = new StringBuilder(workString);
        todoList.add(work);
    }
}
