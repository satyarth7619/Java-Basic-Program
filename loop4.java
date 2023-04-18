import java.util.*;
public class loop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.print("sum is:" + sum);

    }

}    