package com.company;

public class Manager extends Person {


    protected  int Holyday;
    protected  int ExtraHolyday;
    protected double incrSalary = 1.5;
//    protected String personPost = "Manager";

    public Manager(String name, String surname, String phone, String address, String post, double salary, int holyday, int extraHolyday, double incrSalary) {
        super(name, surname, phone, address, post, salary);
        this.incrSalary = incrSalary;
        Holyday = holyday;
        ExtraHolyday = extraHolyday;
    }

    @Override
    public double PersonSalary() {
        return  (salary*incrSalary);
    }

    @Override
    public int PersonHolyday() {
        return (Holyday + ExtraHolyday);
    }

    @Override
    public String toString() {
        return "Manager{" +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Address='" + Address + '\'' +
                ", Post='" + Post + '\'' +
                ", salary=" + PersonSalary() +
                " Holyday=" + PersonHolyday() +
                '}';
    }
}
