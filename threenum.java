import java.util.Scanner;
public class threenum{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the first Number: ");
     int num1 = sc.nextInt();
     System.out.println("Enter the second Number: ");
     int num2 =sc.nextInt();
     System.out.println("Enter the third Number: ");
     int num3 =sc.nextInt();
     
      if ((num1 >= num2) && (num1 >= num3))
        System.out.println (num1 + " is the greatest");

    //checking if num2 is greatest
    else if ((num2 >= num1) &&( num2 >= num3))
        System.out.println (num2 + " is the greatest");

    // num3 has to be greatest then if not above
    else
        System.out.println (num3 + " is the greatest");
  }
}