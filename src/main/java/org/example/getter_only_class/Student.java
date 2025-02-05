package org.example.getter_only_class;

/*
 * The purpose of this class is to demonstrate how can we make a class only getter specific
 */

public class Student {
    private String name;
    private float height;
    private Address address;

    public Student(String name, float height, Address address) {
        this.name = name;
        this.height = height;
        String city = address.getCity();
        String state = address.getState();
        this.address = new Address(city, state);
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public Address getAddress() {
        return new Address(this.address.getCity(), this.address.getState());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", address=" + address +
                '}';
    }
}
