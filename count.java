import java.util.Scanner;
public class count {

    // Moved the countofdigits method to the outer class
    public static int countofdigits(long n) {
        // Base case
        // if (n == 0)
        //     return 1;

        // int count = 0;

        // // Iterate till n has digits remaining
        // while (n != 0) {
        //     // Remove rightmost digit
        //     n = n / 10;

        //     // Increment digit count by 1
        //     ++count;
        // }
        // return count;

        if(n/10==0)
        return 1;
        return 1 + countofdigits(n/10);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        long n = sc.nextLong();
        // Call the countofdigits method correctly
        System.out.println("The Total count of Num is :" + countofdigits(n));
    }
}