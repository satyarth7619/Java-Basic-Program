import java.util.*;

public class largestof3no {
    public static void main(String arg[]) {
        Scanner sc =new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if (A>=B && A>=C){
            System.out.println("A is largest ");
        }
        else if (B>=C){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
    
}
