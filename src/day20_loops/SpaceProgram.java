package day20_loops;

public class SpaceProgram {
    public static void main(String[] args) {

        String s = "java is fun";
        String result = "";

        for (int i = 0; i < s.length(); i++) {  // i <= s.length()-1
            char letter = s.charAt(i);

            if (letter == ' ') {
                result += "_ ";
            } else {
                result += letter + " ";
            }


        }
        System.out.println(result.trim());
    }
}
