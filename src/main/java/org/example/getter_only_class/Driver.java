package org.example.getter_only_class;

public class Driver {

    public static void main(String[] args) {
        Address address = new Address("Bangalore", "Karnataka");
        Student student = new Student("Naman", 169.3f, address);
        System.out.println(student);

        address.setCity("Bengaluru");
        System.out.println(student);
        student.getAddress().setState("Jharkhand");
        System.out.println(student);
    }
}
