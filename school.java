import java.util.Scanner;
public class school{

    String passorfail(int num){
        if(num>=35){
            System.out.println("You passed with Score of " +num);
            return "pass";
        }
        else{
            System.out.println("You failed with a score of "+ num);
        }
        return "failed";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you mark :");
        int number =sc.nextInt();
        school obj = new school();
        obj.passorfail(number);
}

}