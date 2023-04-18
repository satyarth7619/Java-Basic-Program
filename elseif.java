import java.util.*;

public class elseif {
    public static void main(String arg[]) {
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
        
        if (age<18){
            System.out.println("CHOTI BACCHI HO ABHI ");
        }
        else if (age >18 && age<80){
            System.out.println("GAADI CHALA SAKTE HO");
        }
        else if(age >=80){
            System.out.println("UMAR HO GAI H");
        }
        else{
            System.out.println("Bhoooot ho tum");
        }
    }
    
}
