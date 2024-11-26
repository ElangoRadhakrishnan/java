class Student{
  int mark =0;
   static  String teacher ="Mark";
}

public class st {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.mark =50;
        s2.mark =40;

        Student .teacher = "Luke";
        System.out.println(s1.teacher);

        

    }
    
}
