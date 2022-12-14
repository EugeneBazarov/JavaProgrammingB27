package day19_loops;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {


        int secretNumber = 87;
        int inputNumber;
        int attempts = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Guess a number");
            inputNumber = input.nextInt();

            if (inputNumber < secretNumber) {
                System.out.println("Number is higher");
            } else if (inputNumber > secretNumber) {
                System.out.println(" Secret number is lower");
            }

            attempts++;

        } while (secretNumber != inputNumber);

        System.out.println("You guessed the number in " + attempts + " attempts");

    }
}
