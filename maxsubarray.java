import java.util.*;

public class maxsubarray {
    public static void maxSumarray(int number[]){
        int currSum=0;
        int maxSum =Integer.MAX_VALUE;

        for(int i= 0; i<number.length; i++){
            int start= i;

            for(int j=i; j<number.length; j++){
                int end =j;
                currSum=0;

                for (int k= start; k<=end; k++){
                    currSum += number[k];
                }
               
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("MAX SUM = " + maxSum);

    }
    public static void main(String args[]) {
        int number[]={2,4,6,8,10};
        maxSumarray(number);
    }
    
}
