package day49_functional_interface.driver;

public class FireFoxDriver implements WebDriver {

    public void get(){
        System.out.println("opening in firefox");

    }

    public void findElement(){
        System.out.println("finding elements in firefox");
    }
}
