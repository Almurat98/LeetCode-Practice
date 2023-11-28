package Practice;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positiveNumberCount=0;
        float negativeNumberCount=0;
        float zeroCount=0;
        int base= arr.size();
        for(Integer n : arr){
            if(n>0){
                positiveNumberCount++;
            }
            else if(n<0){
                negativeNumberCount++;
            }else {
                zeroCount++;
            }
        }
        System.out.format("%.6f\n",positiveNumberCount/base);
        System.out.format("%.6f\n",negativeNumberCount/base);
        System.out.format("%.6f\n",zeroCount/base);
    }



}
