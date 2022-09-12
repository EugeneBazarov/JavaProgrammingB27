package day06_operators;

public class RelationsExamples {
    public static void main(String[] args) {


        System.out.println(3 >= 2);
        System.out.println(5 > 10);

        int a = 10;
        int b = 20;
        System.out.println(a < b); // 10 < 20
        System.out.println(a < 15); // 10 < 15 -> true

        System.out.println(10 == 10);
        boolean isEqual = 11 == 5;
        System.out.println(isEqual);

        System.out.println(4 != 20);
        System.out.println(20 != 20);


        int number = 20;
        boolean isEven = number % 2 == 0;
        boolean isOdd = number % 2 !=0; // num % 2 == 1 // isEven !=true

        System.out.println("Is even: " + isEven);
        System.out.println("Is odd: " + isOdd);


        int num = 7;
        boolean isValid = num > 5 || num < 10;
        System.out.println("isValid = " + isValid);












    }
}
