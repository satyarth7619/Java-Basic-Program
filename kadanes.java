import java.util.*;

public class kadanes {
    public static void kadanesSum(int number[]){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<number.length; i++){
            currSum = currSum +number[i];
            if(currSum<0){
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);

    }
    public static void main(String args[]) {
        int number []={1,2,3,3,4};
        kadanesSum(number);
    }
}
