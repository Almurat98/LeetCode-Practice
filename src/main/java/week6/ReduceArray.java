package week6;

import java.util.Arrays;

public class ReduceArray {


    public static void main(String[] args) {


        int [] nums = new int []{4,6,8,10};
        System.out.println(Arrays.toString(reduceArrayNum(nums)));
    }

    private static int[] reduceArrayNum(int[] nums) {

        int [] reducedArrays = new int[3];

        for (int i = 0; i < nums.length-1; i++) {
                reducedArrays[i] = nums[i]+nums[i+1];
            }


        return reducedArrays;

    }
}
