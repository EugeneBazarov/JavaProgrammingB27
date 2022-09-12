package day04_variables;

public class CarDriver {

    public static void main(String[] args) {
        System.out.println("New York State\nDRIVER LICENSE\nUNDER 21");

        char letter1 = 'N';
        char letter5 = 'J';
        char letter9 = 'b';
        char letter2 = 'i';
        char letter6 = 'a';
        char letter10 = 's';
        char letter3 = 'k';
        char letter7 = 'c';
        char letter4 = 'o';
        char letter8 = 'o';


        System.out.println("Name: " + letter1 + letter2 + letter3 + letter4 + " " + letter5 + letter6 + letter7 + letter8 + letter9 + letter10);

        String licenseNumber = "987 654 321";
        String dateOfBirth = "10/31/2003";
        String issued = "03/07/2022";
        String expires = "10/31/2026";
        String carModel = "BMW";
        String color = "Black";
        char licenseClass = 'D';
        int speed = 50;
        boolean isAutomatic = true;


        System.out.println("License number: ID " + licenseNumber);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Issued: " + issued);
        System.out.println("Expires: " + expires);
        System.out.println("Car model: " + carModel + "Passenger");
        System.out.println("Color: " + color);
        System.out.println("License class: " + licenseClass);
        System.out.println("Speed: " + speed + "mph");
        System.out.println("Is automatic: " + isAutomatic);


    }
}
