import  java.util.Scanner;
public class twonum{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    int num1=sc.nextInt();
    System.out.println("Enter the Second number");
    int num2 =sc.nextInt();

    if(num1>num2){
        System.out.println("The first number is greater: "+num1);
    }
    else if (num1==num2){
        System.out.println("The both number is equal");
    }
    else{
        System.out.println("The Second number is greater:"+ num2);
    }
}
}
