package com.iit.sd2.week8.Person;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address1 = new Address("1, 1st Street",
                "RA De Mel Mw", "Colombo", "Western Province");
        Person person1 = new Person(
                "John Doe",
                25,
                address1

        );

        System.out.println(person1.getAddress().getCountry());
    }
}
