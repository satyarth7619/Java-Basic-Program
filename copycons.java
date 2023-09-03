public class copycons {
    public static void main(String args[]) {
        Student s1 = new Student(s1);
        s1.name = "Satyarth";
        s1.roll = 453;
        s1.password = "helo";

        Student s2 = new Student(s1);
        s2.password = "hello";

        System.out.println("s1: " + s1.name + " " + s1.roll + " " + s1.password);
        System.out.println("s2: " + s2.name + " " + s2.roll + " " + s2.password);
    }
}

class Student {
    String name;
    int roll;
    String password;

    
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        
    }
}
