import  java.util.Scanner;
public class find{
void evenorodd (int num){
if(num%2 == 0){
    System.out.println("The Number is Even :" +num);
}
else{
    System.out.println("The Number is odd :" +num);
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a Number :");
        int number= sc.nextInt();
       
        find obj = new find();
                obj.evenorodd(number);

}

}