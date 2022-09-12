package day06_operators;

public class LogicalExample {
    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isGoodTemp = true;
        boolean doBbq = isWeekend && isGoodTemp;// && and both boolean need to be true, for true result
        /*
        this is not necessary --> ==
        isWeekend == true && isGoodTemp == true;
         */

        System.out.println("Do bbq: " + doBbq);

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFireFighter = false;
        boolean getDiscount = isTeacher || isPolice || isFireFighter;// || or only one of the boolean need to be true, for the result to be true
        System.out.println("Get a discount: " + getDiscount);


        int num = 7;
        boolean isValid = num > 5 && num < 10;
        System.out.println("isValid = " + isValid); // true && true --> true
        System.out.println(num > 5 && num <3);// true && false --> false





    }
}
