package day20_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple words");
        String str = input.nextLine().toLowerCase();
        String camelCase = "";

        for(int i = 0; i < str.length(); i++){// when there is a space character it will do some action, add the next character as uppercase as the start of the next word

            if(str.charAt(i) == ' '){

                camelCase += str.substring(i+1, i+2).toUpperCase();// gives the one character after the space
                i++; // we need to change the i because we already used the start of the first word and don't want to repeat it

            }else{
                camelCase += str.charAt(i);
            }
        }
        System.out.println(camelCase);











    }
}
