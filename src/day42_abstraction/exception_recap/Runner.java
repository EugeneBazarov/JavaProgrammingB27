package day42_abstraction.exception_recap;

public class Runner {
    public static void main(String[] args) {
        System.out.println(VendingMachine.select(1));// this method has an unchecked exception - normally these exceptions are not handled


        // select(2) --> causes the exception


        try{
            System.out.println(VendingMachine.selectValid(1));

        } catch (InvalidSelectionException e){
            System.out.println(e.getMessage());
        } finally {
            // block of code that will run always
            // you could stop this block from running if you use System.exit() before this block
        }
    }
}
