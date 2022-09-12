package day24_array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int []nums = {10, 5, 1, 0, 0, 0};
        int []fixed  = new int [nums.length]; // [0, 0, 0, 0, 0, 0]
        int indexToRead = 0;// read every element from beginning to the end --> same as i in a traditional loop
        int indexToStore = 0;// store values into the fixed array, maybe will not increment each time

        // indexToRead  : 6
        // indexToStore : 3

        while(indexToRead < nums.length){

            if(nums[indexToRead] != 0){
                fixed[indexToStore] = nums[indexToRead];
                indexToStore++;
            }

            indexToRead++;
        }
        System.out.println(Arrays.toString(fixed));

    }
}
