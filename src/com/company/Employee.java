package com.company;

public class Employee extends Person {

//    protected double incr = 1.0;
    protected  int Holyday;


    public Employee(String name, String surname, String phone, String address, String post, double salary, int holyday) {
        super(name, surname, phone, address, post, salary);
        Holyday = holyday;
    }

        @Override
        public double PersonSalary() {
            return (salary);
        }

        @Override
        public double PersonHolyday() {
            return (Holyday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Address='" + Address + '\'' +
                ", Post='" + Post + '\'' +
                ", salary=" + salary +
                " Holyday=" + Holyday +
                '}';
    }
}
