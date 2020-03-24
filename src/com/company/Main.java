package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person[] person = new Person[4];
    person[0] =  new Employee("Name 1", "SurName 1", "+324255245353", "Street1, 1", "Employee 1", 500, 20);
    person[1] =  new Employee("Name 2", "SurName 2", "+324255245353", "Street2, 2", "Employee 2", 550, 20);

    person[2] =  new Manager("Name 3", "SurName 3", "+324255245353", "Street3, 3", "Manager 1", 500, 20, 3, 1.5);
    person[3] =  new Manager("Name 4", "SurName 4", "+324255245353", "Street4, 4", "Manager 2", 500, 20, 2, 1.3);

        for (Person pers : person) {
            System.out.println(pers.toString());
        }

    }
}
