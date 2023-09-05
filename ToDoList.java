import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    Scanner sc = new Scanner(System.in);

    /**
     * this will add a task to the ToDo list arryList
     * 
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
     * 
     * @param todoList this is the ToDo list container ArrayList
     */
    public void markDone(ArrayList<StringBuilder> todoList) {
        System.out.println("Enter the idex of work");
        printList(todoList);
        int position = sc.nextInt();
        todoList.get(position - 1).insert(1, "X");
    }

    /**
     * This will print the full todo list 
     * @param todoList This is the ArrayList which contains the ToDo List
     */
    public void printList(ArrayList<StringBuilder> todoList) {
        int counter = 1;
        System.out.println("Thuse are the taks of the day:");
        for (int itarator = 0; itarator < todoList.size(); itarator++) {
            System.out.println(counter + "." + todoList.get(itarator));
            counter++;
        }

    }

}
