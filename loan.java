
import java.util.Scanner;

public class loan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the salary : ");
    int salary = sc.nextInt();

    System.out.print("Enter the age : ");
    int age = sc.nextInt();

    System.out.print("Enter the loan amount :");
    int loan = sc.nextInt();

    if (salary > 20000 && age >= 25){
        System.out.println("You are eligible for loan");
      }  else if (!(loan < 50000)) {
        System.out.println("Loan amount exceeds the maximum limit of 500000");
      }
     else {
      System.out.println("You are not eligible for loan");
    }
  }
}
