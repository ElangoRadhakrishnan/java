
public class practice
{
    String getname(String name){
        return name;
    }
    long phonenumber(long num){
        return num;
    }
    
	public static void main(String[] args) {
	    practice obj =new practice();
	    String newname = obj.getname("Arul");
	    System.out.println(newname);
	    
long phoneno = obj.phonenumber(9876543210L);	    
System.out.println(phoneno);
	}
}