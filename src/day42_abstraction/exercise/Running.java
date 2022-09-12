package day42_abstraction.exercise;

public class Running extends Exercise {


    public void perform(){
        System.out.println("We are running");

    }

    public void gerCaloriesBurned(int minutes){
        System.out.println(minutes * 0.35);
    }
}


/*
Running is an Exercise
Running is non-abstract (normal class)
Running is the first non-abstract class it is the concrete class

Concrete classes must implement (override) all the abstract methods
 */