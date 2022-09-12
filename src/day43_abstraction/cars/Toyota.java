package day43_abstraction.cars;

import day43_abstraction.cars.Car;

public class Toyota extends Car {

    @Override
    public void start() {
        System.out.println("turning the key to start");
    }
}
