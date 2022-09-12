package day03_variables;

public class Store {

    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems + "in the store");// combines the value of the numberOfItems variables with the characters 'in the store'
        numberOfItems = 700; // reassigned 700 into the variable
        System.out.println(numberOfItems + "after the sale");

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment);// soutv shortcut


        double totalCost = 10_000_000.99; // 10,000,000.99
        System.out.println(totalCost);
        System.out.println(totalCost);

        float f = 19.99F; // adding the letter f/F will tell the compiler this is a float number, not a double number

        float f2 = 100; // 100 is int type by default, and int is smaller than float, so there is no problem here
        System.out.println(f);
        System.out.println(f2);

        long population = 8_000_000_000L; // adding l/L to the number will change the type from int(the default) to a long type, because 8 billion was too big to be held in an int type
        System.out.println(population);

        long pop2 = 1_000_000; // L is not needed because 1 million is a valid number for int types, and that type can automatically be converted to a bigger type

        int age = 45;
        short year = 3000;
        int salary = 100000;
        long miles = 9999999999L;

        double tax = 0.26;
        float pi = 3.14F;

    }
}
