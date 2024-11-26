import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Row: ");
        int row = sc.nextInt();
        
        for (int i =row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing a row of asterisks
        }
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}