import java.util.*;
public class linears {
    public static int linear(int number[] , int keys) {
        
        for(int i=0; i<number.length; i++){
           if(number[i]== keys){
                return i;
           }
        }


    return -1;
        
    }
    public static void main(String args[]) {

        int number[]= {23,23,34,11,34,10,20,30};

        int keys= 23;

        int index = linear(number, keys);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println(index);
        }
    }    
}
