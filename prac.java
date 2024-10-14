import java.util.Scanner;
public class prac{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("Enter the marks");
int marks=sc.nextInt();
if(marks<=50){
    System.out.println("You need to improve");
}
if(marks<=69){
    System.out.println("You are good to go");
}
if(marks>=70){
System.out.println("Excelent work");
}
}
}