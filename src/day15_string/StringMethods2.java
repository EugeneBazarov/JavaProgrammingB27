package day15_string;

public class StringMethods2 {
    public static void main(String[] args) {


        String word = "java";

        System.out.println(word.startsWith("j"));
        System.out.println(word.startsWith("ja"));
        System.out.println(word.startsWith("jae"));

        System.out.println("-----------------------------------------");

        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("A"));
        System.out.println(word.endsWith("java"));

        boolean b = word.startsWith("hello");
        System.out.println();

















    }
}
