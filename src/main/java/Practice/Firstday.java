package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Firstday {

    public static void main(String[] args) {
        /*
    Write a method that returns the factorial number of any given number.
    Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller than or equal to n.
    For example, factorial of 6 is 6*5*4*3*2*1 which is 720.
     */
        System.out.println(getFactorialNumber(6));
        System.out.println(getFactorialNo(6));
    }

    public static int getFactorialNumber(int n){
        int factorialNumber=n;
        for (int i = 1;i<n; i++) {
            factorialNumber*= i;

        }
        return factorialNumber;
    }

    public static int getFactorialNo(int x){

        return IntStream.iterate(1,i -> i<=x , i -> i+1).reduce(1,(n,m) -> n*m);
    }
    }
