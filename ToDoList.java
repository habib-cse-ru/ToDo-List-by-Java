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
    /**
     * this will mark a work is done . to do so it will take a input the task index
     * @param todoList this is the ToDo list container ArrayList
     */
    public void markDone(ArrayList<StringBuilder> todoList) {
        System.out.println("Enter the idex of work");
        int position = sc.nextInt();
        todoList.get(position - 1).insert(1, "X");

    }

}
