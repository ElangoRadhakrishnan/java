import java.util.Scanner;
public  class wen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] marks = new int [10];

        for(int i =0 ;i<=9;i++){
            marks[i] =sc.nextInt();
        }
        for(int i =0; i<=9;i++){
            System.out.println(marks[i]);
        }

}
}
