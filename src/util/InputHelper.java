package util;

import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;
   
    public InputHelper(Scanner scanner) {
        this.scanner = scanner;
    }
   
    public int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
   
    public double readDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
   
    public String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
   
    public int readMenuChoice(String prompt, int min, int max) {
        while (true) {
            int choice = readInt(prompt);
            if (choice >= min && choice <= max) {
                return choice;
            }
            System.out.println("Invalid choice. Please enter " + min + "-" + max);
        }
    }
}
