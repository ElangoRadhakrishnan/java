
import java.util.Scanner;
public class loop{
    public static void main(String[] args) {
        // for(int i=10; i>=0+1;i--){
        //     System.out.println(i);
        // }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i <= secondNumber; i=1+i) 
        if(i%2==0){
          System.out.println(i);   
        }

    
}
}
