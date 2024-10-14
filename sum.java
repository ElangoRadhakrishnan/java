import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number  : ");
int n =sc.nextInt();  // Replace with the desired integer value
        int sums = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sums += i;
            }
        } 
          System.out.println("Sum of divisors: " + sums);


}

    }