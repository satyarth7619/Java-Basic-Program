import java.util.*;
public class reverse1 {
    public static void reverseArray(int numbers[]){

        int first=0 , end=numbers.length-1;

        while(first<end){
            int temp = numbers[end];
            numbers[end]=numbers[first];
            numbers[first]= temp;

            first++;
            end--;

        }
    }
    public static void main(String args[]) {
        int number[] = {1,2,3,4,5,6,7,8,9};

        reverseArray(number);
        for(int i= 0; i<number.length; i++){
            System.out.print(number[i]);
        }
        System.out.println();
    }
}
