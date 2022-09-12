package day04_variables;

public class Employee {
    public static void main(String[] args) {

        String fullName = "Eugene Bazarov";
        String companyName = "Google";
        String jobTitle = "Web Developer";
        String email = "eugene55588@google.com";
        String benefits = "100.000$ salary a year, 15.5 PTO days and work from home";
        char suite = 'A';
        int employeeId = 55588;
        double numberOfPto = 15.5;
        double salary = 180.000;
        boolean isFullTime = true;

        System.out.println("Company name: " + companyName);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Email: " + email);
        System.out.println("Benefits: " + benefits);
        System.out.println("Suite: " + suite);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Number of PTO: " + numberOfPto);
        System.out.println("Salary: " + salary);
        System.out.println("Is full time: " + isFullTime);

        System.out.println("Employment information for " + fullName + "." + "Secret Agent for " + companyName + "," + "based in suite " + suite + "." + "Mr.Eugene is full time: " + isFullTime + "." + "Contact Mr.Eugene at " + email + "." + "Current benefits include " + benefits);



    }
}
