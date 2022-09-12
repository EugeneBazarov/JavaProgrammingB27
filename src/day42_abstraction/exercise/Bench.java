package day42_abstraction.exercise;

public class Bench extends Lifting{


        public void perform(){
            System.out.println("Bench press");

        }

        public void gerCaloriesBurned(int minutes){
            System.out.println(10 * minutes);
        }

        public void rackWeights(){
            System.out.println("Putting the bar back on the rack");

        }// Bench is my concrete class
    }

