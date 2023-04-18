import java.util.*;

public class break1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        do{
            System.out.println("enter your number :");
            int n= cs.nextInt();
            if (n%10==0)
            {break;}
            System.out.println(n);


        }while(true);
    }
    
}
