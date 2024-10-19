import java.util.Scanner;
public class reverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String ch = sc.nextLine();
        String reversed = "";

        for (int i = ch.length() - 1; i >= 0; i--) {
            reversed += ch.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }

}