package Practice;

import java.io.*;
import java.util.*;

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
        list1.add(3);
        list1.add(2);
        list1.add(1);
                list1.add(3);
        //list1.add(5);
//        List<Integer>list2= new ArrayList<>();

//        list2.add(6);
//        List<Integer>list3= new ArrayList<>();
//        list3.add(10);
//        list3.add(8);
//        list3.add(-12);
//
//        arr.add(list1);
//        arr.add(list2);
//        arr.add(list3);

       // miniMaxSum(list1);
       // System.out.println(Result.diagonalDifference(arr));
       // System.out.println(birthdayCakeCandles(list1));

        System.out.println(timeConversion("05:05:45PM"));
    }


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
       Long min=0l;
        Long max=0l;
        Collections.sort(arr);

        for (int i = 0; i < arr.size()-1; i++) {
            min+=arr.get(i);
        }
        for (int i = 1; i <arr.size() ; i++) {
            max+=arr.get(i);
        }
        System.out.println(min+" "+max);
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Queue<Integer>tallCandles= new ArrayDeque<>();
        tallCandles.add(candles.get(0));
        for (int i = 1; i <candles.size(); i++) {
            if(candles.get(i)>candles.get(i-1)&&candles.get(i)>tallCandles.peek()){
                tallCandles.poll();
                tallCandles.add(candles.get(i));
            }else if(Objects.equals(candles.get(i), tallCandles.peek())){
                tallCandles.add(candles.get(i));
            }
        }
        return tallCandles.size();
    }

    public static String timeConversion(String s) {
        // Write your code here
        String hr=s.substring(0,2);
        String t=s.substring(s.length()-2);
        String withoutT = s.substring(0, s.indexOf(t));
        if(t.equals("AM")){
            if(Integer.parseInt(hr)==12){
              s=  withoutT.replace(hr,"00");
            }else{
                return withoutT;
            }
        }
        else if(t.equals("PM")){
            if(Integer.parseInt(hr)==12){
                return withoutT;
            }else{
                s=withoutT.replace(hr,String.valueOf(Integer.parseInt(hr)+12));
            }
        }

        return s;
    }
}
