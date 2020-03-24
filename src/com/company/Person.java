package com.company;

public abstract class Person {
    protected String Name;
    protected String Surname;
    protected String Phone;
    protected String Address;
    protected String Post;
    protected double salary;


    public Person(String name, String surname, String phone, String address, String post, double salary) {
        Name = name;
        Surname = surname;
        Phone = phone;
        Address = address;
        Post = post;
        this.salary = salary;
    }

    public abstract double PersonSalary();

    public abstract double PersonHolyday();


}
