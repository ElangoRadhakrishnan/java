import java .util.Scanner;
public class pallindrome{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        int r,sum=0,temp;    
        //int n= 121 ;//It is the number variable to be checked for palindrome  
        System.out.println("Enter a Number : ");
        int n =sc.nextInt();
     temp=n;    
       
    while(n > 0) {    
   
    r=n%10;  //getting remainder  
    sum=(sum*10)+r;    
    n=n/10;    
  }    
  
  if(temp == sum)    {
   System.out.println(temp+": is a  palindrome number ");    
  }else  {  
   System.out.println(temp  +": is not  a palindrome number ");    
}  
      
}
}