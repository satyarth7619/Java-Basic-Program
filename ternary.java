import java.util.Scanner;

public class ternary {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String type =(N%2==0)? "even" : "odd" ;
        System.out.println(type);
    }
}
