
import java.util.Scanner;

public class ne {

    static  int reverse(int num){
        if (num < 10) {
            System.out.println(num);
           
        }
        else {
            // print the unit digit of the given number
            System.out.print(num % 10);
            // calling function for remaining number other than unit digit
            reverse(num / 10);
        }
               return num;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt(); 
        reverse(num);
        // System.out.println("reversed number" +reverse(num));
      
       
}
}