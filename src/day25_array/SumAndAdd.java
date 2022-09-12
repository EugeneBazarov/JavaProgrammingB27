package day25_array;

import java.util.Arrays;

public class SumAndAdd {
    public static void main(String[] args) {

        int [] arr = {5, 1, 2, 8};
        int sum = 0;

        for(int each : arr){
            sum += each; // goes through every element and adds to the sum variable
        }

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        System.out.println(Arrays.toString(newArr));
        newArr[newArr.length - 1] = sum; // storing the sum value into the last index of the newArr
        System.out.println(Arrays.toString(newArr));





    }
}
