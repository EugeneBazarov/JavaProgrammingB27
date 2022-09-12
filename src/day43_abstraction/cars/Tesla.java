package day43_abstraction.cars;

import day43_abstraction.cars.ElectricCar;

public class Tesla extends ElectricCar {

    @Override
    public void start() {
        System.out.println("Key car near by, starting car");
    }

    @Override
    public void charge() {
        System.out.println("tesla charging station");

    }
}

// Tesla is a ElectricCar
// Tesla is a Car
// Tesla is an Object

