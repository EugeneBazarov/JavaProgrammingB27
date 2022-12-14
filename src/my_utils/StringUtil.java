package my_utils;

public class StringUtil {
    /*
    This class will be used to create String utility methods
     */

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
    // palindrome means the String is the same forward and backwards

    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }

    /*
    Fix Format

    create a method will accept a String and return a String in proper format. Proper format is:
    First character starting as uppercase and the rest as lowercase
    */

    public static String fixFormat(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String camelCase(String str) {
        String[] allWords = str.split(" ");
        String camelCase = allWords[0].toLowerCase();

        for (int i = 1; i < allWords.length; i++) { // Starting from index 1 because I already used first word
            camelCase += fixFormat(allWords[i]);

        }
        return camelCase;
    }
}
