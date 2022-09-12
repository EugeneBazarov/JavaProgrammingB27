package day05_arithmetic_operators;

public class AverageNumber {
    public static void main(String[] args) {

        int players = 4;
        int score1 = 30 + 10;
        int score2 = 44 + 23;
        double score3 = 19.50 + 13.33;
        double score4 = 25.02 + 33.89;
        double totalScore = score1 + score2 + score3 + score4;
        double averageScore = totalScore / players;

        System.out.println("There are " + players + " players");
        System.out.println("Score1 = " + score1);
        System.out.println("Score2 = " + score2);
        System.out.println("Score3 = " + score3);
        System.out.println("Score4 = " + score4);
        System.out.println("Total score is " + totalScore);
        System.out.println("Average score is = " + averageScore);














    }
}
