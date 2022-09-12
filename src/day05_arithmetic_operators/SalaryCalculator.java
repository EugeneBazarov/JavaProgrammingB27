package day05_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        int salary = 180_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println(" ------------------\n Salary Calculator: \n Total Salary: $" + salary + "\n State Tax Rate: " + stateTaxRate + " % " + "\n Federal Tax Rate: " + federalTaxRate + " % " + "\n State Tax: $" + stateTax + "\n Federal Tax: $" + federalTax + "\n Total Tax: $" + totalTax + "\n Salary After Tax: " + salaryAfterTax + "\n-------------------");













    }
}
