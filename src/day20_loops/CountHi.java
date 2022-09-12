package day20_loops;

public class CountHi {
    public static void main(String[] args) {
        //counting how many times hi is in the String
        String s = "asdhisadhisadshiasd";

        //approach 1: while loop and delete the first occurrence each time
        int count = 0;

        while(s.contains("hi")){
            System.out.println(s);
            count++;
            s = s.replaceFirst("hi", "");// replace the first occurrence


        }
        System.out.println(count);

        // approach 2: for loop to check one index at a time, but when there is an h we will check another index

        String s2 = "asdsadhisadhisadhisadhi";
        int count2 = 0;

        for(int i = 0; i < s2.length(); i++){

            if(s2.charAt(i) == 'h' && s2.charAt(i + 1) == 'i');

        }
    }
}
