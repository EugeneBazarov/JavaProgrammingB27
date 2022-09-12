package day13_switch_string;

public class DayInMonth {
    /*

    Write a program that will accept a month name and outputs how many days
    are in that month
    data:
    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days

         */

    public static void main(String[] args) {

        String month = "February";

        switch (month) {

            case "February":
                System.out.println("28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;
            case "January":
            case "March":
            case "May":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid number");

        }
    }
}
