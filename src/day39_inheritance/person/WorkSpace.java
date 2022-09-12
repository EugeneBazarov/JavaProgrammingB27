package day39_inheritance.person;

import day39_inheritance.person.Employee;

public class WorkSpace {
    public static void main(String[] args) {

        Employee james = new Employee("James Bond", 40, 100_000_000);
        System.out.println(james);
    }
}
