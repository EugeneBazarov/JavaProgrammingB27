package day43_abstraction.cars;

import day43_abstraction.cars.Car;

public class BMW extends Car {

    @Override
    public void start() {
        System.out.println("pressing the button to start");
    }
}
