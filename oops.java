public class oops {
    public static void main(String args[]) {
      
        
        Student s1 = new Student();
        Student s2 = new Student("satyarth");
        Student s3 =new Student(123);
    }
}
//constructor 
class Student{
    String name ;
    int roll;
    
    Student(){
        System.out.println("Constructor is called .....");
    }


    Student(String name ){
        this.name = name;//parameterized constuctor
    }
    Student (int roll ){
        this.roll= roll;

    }

}
 