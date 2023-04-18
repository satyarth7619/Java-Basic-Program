import java.util.*;
 public class negpos {
    public static void main(String arg[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER NUMBER");
        int a =sc.nextInt();
        
        if(a>=0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative number");
        }
    }
}
