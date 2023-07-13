import java.util.*;
public class largestno {
    
    /*public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest=number[i];

            }
            if(smallest>number[i]){
                smallest=number[i];
            }

        }
        System.out.println("Smallest Number is " + smallest);
        return largest;
    }*/

    // Binary Search
    public static int binarySearch(int number[] , int key){
        int start=0 ,end=number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            
            if (number[mid]==key){
                return mid;
            }
            if (number[mid]<key){

                start= mid+1;

            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={3,4,5,6,7,8,9};
        int key= 3;
       // System.out.println("Largest Number is " + getLargest(number));
       System.out.println(binarySearch(number, 0));
    }
}
