package day04_variables;

public class Computer {
    public static void main(String[] args) {

        String brand = "\"Acer\"";
        String processor = "Intel Core i5";
        int ramMemory = 64;
        int storageMemory = 8;
        boolean hasMonitor = true;
        boolean hasWifiCard = true;
        double price = 1399.99;
        short numberOfUsbSlots = 6;
        boolean hasBluetooth = true;

        System.out.println("Brand of the computer is " + brand);
        System.out.println("It has " + processor);
        System.out.println("Ram memory: " + ramMemory);
        System.out.println("Storage memory: " + storageMemory);
        System.out.println("Has monitor = " + hasMonitor);
        System.out.println("Has WifiCard = " + hasWifiCard);
        System.out.println("Total price: = " + price);
        System.out.println("Number of Usb slots: " + numberOfUsbSlots);
        System.out.println("Has Bluetooth = " + hasBluetooth);


    }
}
