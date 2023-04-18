import javax.print.event.PrintEvent;

public class reverse {
    public static void main(String[] args) {
        int a =234567;
        while(a>0){
            int lastdigit =a%10;
            System.out.print(lastdigit);
            a=a/10;
        }

    }
}
