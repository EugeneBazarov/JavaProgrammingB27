package day25_array;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {

        String[] str = {"hello", "world", "monday", "java"};
        System.out.println(Arrays.toString(str));
        System.out.println(String.join(",", str));
        System.out.println(String.join(" ", str));
        System.out.println(String.join(" MIDDLE ", str));

        int[] aar = new int[]{1, 5, 2, 5}; // another syntax to create an array
        // normally used when you don't need a reference
        System.out.println(Arrays.toString(new int[]{3,5,2,6}));
    }
}
