package day06_operators;

public class AgeCheckers {
    public static void main(String[] args) {

        int age = 12;


        boolean isChild = age <= 13;
        boolean isSenior = age >= 65;

        System.out.println("Is child " + isChild);
        System.out.println("Is senior " + isSenior);
    }
}
