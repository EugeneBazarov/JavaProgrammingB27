package day36_custom_classes.food;

import day36_custom_classes.food.Food;

import java.util.Arrays;

public class Kitchen {
public static void main(String[] args) {

    Food[] allFood = new Food[5];
    System.out.println(Arrays.toString(allFood));
    Food apples = new Food("apples");
    allFood[0] = apples; // storing the Food object, apples, the Food array
    allFood[1] = new Food("Sushi", 10);
    allFood[2] = new Food("Cajun Pasta", 2, 3.99);
    allFood[3] = new Food("Kebab", 5, 2.5);
    allFood[4] = new Food("Plov", 4, 2.99);
    System.out.println(Arrays.toString(allFood));

    // print each Food object in a separate line
    System.out.println();

    for(Food each : allFood){
        System.out.println(each);

    }

    // find all the Food objects that start with "a" , or "c" and print the whole information
    System.out.println("Food that starts with with A or C");

    for(Food each : allFood){
        if(each.name.startsWith("A") || each.name.startsWith("C")){
            System.out.println(each);
        }
    }

    System.out.println("Food that is over 20$");
    for(Food each : allFood){
        if(each.totalPrice >= 9){
            System.out.println(each.name);
        }
    }
   }
}
