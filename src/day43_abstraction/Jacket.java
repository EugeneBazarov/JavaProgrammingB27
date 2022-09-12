package day43_abstraction;

public class Jacket extends Clothes implements HasHood{


    @Override
    public void wear() {
        System.out.println("Wearing the jacket");
    }


    @Override
    public void putHoodOn() {
        System.out.println("Putting on jacket hood");

    }
}

