package day03_variables;

public class School {

    public static void main(String[] args) {

        int grade1, grade2 , grade3, grade4, grade5;

        grade1  = 15;
        grade2  = 22;
        grade3  = 19;
        grade4  = 30;
        grade5  = 44;

        System.out.println("The amount of students in the first grade is " + grade1 );
        System.out.println("The amount of students in the second grade is " + grade2 );
        System.out.println("The amount of students in the third grade is " + grade3 );
        System.out.println("The amount of students in the fourth grade is " + grade4 );
        System.out.println("The amount of students in the fifth grade is " + grade5 );

        int totalAmountOfStudents = grade1 + grade2 + grade3 + grade4 +grade5;
        System.out.println("The amount of total student is " + totalAmountOfStudents );

        double averageGpa = 3.9;
        double numberOfSchoolDays = 200;
        double numberOfSnowDays = 25;
        System.out.println("The average GPA is " + averageGpa );
        System.out.println("Number of school days is " + numberOfSchoolDays );
        System.out.println("Number of snow days is " + numberOfSnowDays );



    }
}
