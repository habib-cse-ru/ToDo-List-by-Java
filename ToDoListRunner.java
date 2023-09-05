import java.util.Scanner;

public class ToDoListRunner {

    public static void main(String[] args) {
        System.out.println("Welcome to To-Do List Application");
        while (true) {
            ToDoList listOne = new ToDoList();
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add Task");
            System.out.println("2.Mark Task As Complited .");
            System.out.println("3.Task List");
            System.out.println("4.Delete Conplited Task");
            System.out.println("5.Exit");
            System.out.println("Enter the index to move foreward :");
            int response = sc.nextInt();
            if (response == 1) {
            } else if (response == 2) {
            } else if (response == 3) {
            } else if (response == 4) {
            } else if (response == 5) {
                break;
            } else {
            }

        }

    }
}