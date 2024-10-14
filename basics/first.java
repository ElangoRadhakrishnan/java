
import java.util.Scanner;

public class first{
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
//   int a = sc.nextInt();
//   int b =  sc.nextInt(); 
//   int c=   sc.nextInt();
//   int d = a *b *c;
//   int e= a+b+c;

//   System.out.print(d/e);

String name = sc.next();
double  score = sc.nextDouble();
sc.nextLine();
String dep = sc.next();
 System.out.println("My name is :" +name );
 System.out.println("My score is :" +score/10 +"/10" );
 System.out.print("My department is :" +dep );
}
}