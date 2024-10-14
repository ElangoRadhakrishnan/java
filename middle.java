import java.util.Scanner;
public class middle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr  = new int [size];
for(int i =0;i<=size-1;i =i+1){
    // System.out.println("Enter the Number :");
    arr[i] = sc.nextInt();
}
System.out.println("Middele number is "+ arr[size/2]);
}
}