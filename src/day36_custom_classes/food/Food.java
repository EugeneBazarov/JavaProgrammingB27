package day36_custom_classes.food;

public class Food {
    /*
    create a class called Food

        - data:

            name, quantity, unit price, total price

        - constructor

            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here

        - method:

            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information


     */

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        // this.name = name;
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        // this.name = name;
        // this.quantity = quantity;
        this.unitPrice = unitPrice;

    }

    public boolean calculatorPrice() {

        if (quantity == 0 || unitPrice == 0) {
            return false;
        }

        totalPrice = unitPrice * quantity;
        return false;

    }

    public String toString() {
        String str = "Name: " + name;

        if (quantity != 0) {
            str += ", quantity: " + quantity;
        }

        if (unitPrice != 0) {
            str += ", unit price: $" + unitPrice;

        }

        return " < " + str + " > ";
    }
}
