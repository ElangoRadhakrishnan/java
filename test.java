import java.util.Random;
public class test{
    public static void main(String[] args) {
        //running randomnumber using while loop
        Random rand =new Random();
        int num =0;
        while(num!=1){
             num= rand.nextInt(11);
            System.out.println(num);
        }

    }    
}