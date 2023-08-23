package Practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int leftSum=0;
        int rightSum=0;
        
        for (int i = 0; i<arr.size(); i++) {
            leftSum=leftSum+ (arr.get(i)).get(i);
            rightSum= rightSum+(arr.get(i)).get(arr.get(i).size()-1-i);
        }
        return Math.abs(leftSum-rightSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {


        List<List<Integer>> arr = new ArrayList<>();

        List<Integer>list1= new ArrayList<>();
        list1.add(11);
        list1.add(2);
        list1.add(4);
        List<Integer>list2= new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer>list3= new ArrayList<>();
        list3.add(10);
        list3.add(8);
        list3.add(-12);

        arr.add(list1);
        arr.add(list2);
        arr.add(list3);

        System.out.println(Result.diagonalDifference(arr));
    }
}
