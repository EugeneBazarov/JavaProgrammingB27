package day43_abstraction.clothes;

import day43_abstraction.clothes.Clothes;
import day43_abstraction.clothes.HasHood;

public class Jacket extends Clothes implements HasHood {


    @Override
    public void wear() {
        System.out.println("Wearing the jacket");
    }


    @Override
    public void putHoodOn() {
        System.out.println("Putting on jacket hood");

    }
}

