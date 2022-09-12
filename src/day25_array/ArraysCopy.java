package day25_array;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] other = nums; // is not creating a new array, it is pointing to the same array as line 8
        System.out.println("BEFORE");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));
        nums[0] = 10; // reassign the first index to 10
        System.out.println("AFTER W/ other");
        other[2] = 25;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));


        int [] arr = {3, 4, 1, 5, 12, 9, -16};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------------------");

        // copyOf

        int [] a = {5, 10, 15};
        int [] b = Arrays.copyOf(a, 3); // new array with size 3
        System.out.println("BEFORE");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[1] = 100;
        System.out.println("AFTER");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // we have two arrays, bur we only change the middle element of the



    }
}
