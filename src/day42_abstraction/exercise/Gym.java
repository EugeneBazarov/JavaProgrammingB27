package day42_abstraction.exercise;

public class Gym {

    public static void main(String[] args) {

//        Exercise obj = new Exercise(); not valid because Exercise is abstract - cannot create object from it

        Running run = new Running();
        run.perform();
        run.gerCaloriesBurned(30);

//        Lifting obj = new Lifting(); Lifting is abstract - we cannot create an object of this class

        Bench benching = new Bench();
        benching.perform();
        benching.gerCaloriesBurned(20);
        benching.rackWeights();

    }
}
