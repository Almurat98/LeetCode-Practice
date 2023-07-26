package week4;

import java.util.Arrays;

public class Assignment_W4 {

    //Given an array of integers, update every element with the multiplication of previous and next
    //elements with the following exceptions.
    // a) The First element is replaced the by multiplication the of first and second.
    // b) The last element is replaced by multiplication of the last and second last.
    // Input : arr[] = {2, 3, 4, 5, 6}
    // Output : arr[] = {6, 8, 15, 24, 30
    public static void main(String[] args) {
        int[] ary = new int []{2,3,4,5,7};

       System.out.println(Arrays.toString(multiplyArray(ary)));

    }

    public static int[] multiplyArray(int[] arr) {
        int length = arr.length;

        // If the array has only one element, return null
        if (length == 1) {
            return null;
        }

        int prev = arr[0]; // Store the previous element
        arr[0] = arr[0] * arr[1]; // Update the first element

        for (int i = 1; i < length - 1; i++) {
            int current = arr[i]; // Store the current element
            arr[i] = prev * arr[i + 1]; // Update the current element
            prev = current; // Update the previous element for the next iteration
        }

        arr[length - 1] = prev * arr[length - 1]; // Update the last element

        return arr;
    }
}
