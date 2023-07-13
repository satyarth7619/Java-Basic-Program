import java.util.*;
public class array1 {
    public static void main(String args[]) {
        String Name[]= new String[100];
        int Rollno[]= new int[100];
        int marks[] =new int [100];

        Scanner sc =new Scanner(System.in);

        Name[0] = sc.next();
        Rollno[0]= sc.nextInt();
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();
        marks[4]= sc.nextInt();
        marks[5]= sc.nextInt();

        System.out.println("NAME :" + Name[0] );
        System.out.println("ROLLNO :" + Rollno[0]);
        System.out.println( "MATH :" + marks[0]);
        System.out.println( "PHYSICS :" + marks[1]);
        System.out.println( "CHEMISTRY :" + marks[2]);
        System.out.println( "COMPUTER :" + marks[3]);
        System.out.println( "ENGLISH :" + marks[4]);
        System.out.println( "ECONOMICS :" + marks[5]);

        //if any update in marks
        marks[3]= 99;
        System.out.println( "COMPUTER :" + marks[3]);

        int precentage = (marks[0]+ marks[1] + marks[2] + marks[3] + marks[4] + marks[5]) / 6;
        System.out.println("PERCENTAGE = " + precentage);

      
        

    }
}
