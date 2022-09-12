package day14_string;

public class StringMethods {
    public static void main(String[] args) {



        String item = "pen"; // in String pool
        String item2 = new String("pen"); // directly in heap
        System.out.println(item == item2); // checks if the object item is the same object as item2

        String item3 = new String("pen");
        System.out.println(item2 == item3);// compares the two objects. They are both in the heap
        // .equals(): compare the value of the Strings, which checks if the characters are the same
        System.out.println(item.equals(item2)); // checks the characters
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));

        System.out.println();
        System.out.println(item.equals("Pen")); // checks for exact characters including cases
        System.out.println(item.equalsIgnoreCase("Pen")); // check only for matching characters and ignores all the cases

        System.out.println("------------------------------------");
        String username = "jamesbond";
        String password = "BOND007";
        //System.out.println(username.equals("JAMESBOND"));
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));
        System.out.println(password.equals("BOND007"));

        System.out.println("------------------------------------");

        String day = "Tuesday";
        System.out.println(day.length());// counts how many character there is
        String day2 = "Friday";
        int len = day2.length();// length() method gives back int type, so we can use it however we want
        System.out.println(len);

        String str = " hello ";// total length is 7 because of spaces, "hello" are 5 long,spaces are also a character
        System.out.println(str.length());


        System.out.println("------------------------------------");
        String sentence = "hello my name is";
        System.out.println(sentence.toLowerCase());// make a new String that was all lowercase, and then printed it
        System.out.println(sentence);// print the original String, because String is immutable it cannot be changed
        String lowerVer = sentence.toLowerCase(); // new object from the method is stored into the new variable
        // option: reassign
        // sentence = sentence.toLowerCase();

        String s = "       java      ";
        System.out.println(s.length());
        s = s.trim(); // trim() method gets rid of all the extra spaces in the beginning and end of a String
        System.out.println(s);
        System.out.println(s.length());

        String s2 = "  multiple words here  ";
        System.out.println(s2.trim());// trim() will remove from beginning and end, middle spaces will not be touched



    }
}
