package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("=====THE UB STUDENT EXCHANGE =====");
        
        do {
            System.out.println("\n1. ADD a listing");
            System.out.println("2. VIEW all listings");
            System.out.println("3. SEARCH listings");
            System.out.println("4. MARKET summary report");
            System.out.println("5. REMOVE a listing");
            System.out.println("0. EXIT");
            System.out.print("ENTER choice: ");
            
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                choice = -1; // Stay in loop
            }
        } while (choice != 0);
        
        System.out.println("THANK SO MUCH AND GOODBYE");
        sc.close();
    }
}




