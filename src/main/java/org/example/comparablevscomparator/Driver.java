package org.example.comparablevscomparator;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Akash");
        s.setHeight(169.8f);
        s.setDateOfBirth("1997-11-07");

        Student s2 = new Student();
        s2.setName("Minal");
        s2.setHeight(156.8f);
        s2.setDateOfBirth("1999-11-07");

        Student s3 = new Student();
        s3.setName("Daniel");
        s3.setHeight(156.8f);
        s3.setDateOfBirth("1998-10-05");

        Set<Student> set = new TreeSet<>(); // sorts according to natural ordering
        set.add(s2);
        set.add(s);
        set.add(s3);

        for(Student st : set ) {
            System.out.println(st);
        }

        set = set.stream().sorted(new HeightComparator()).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println();
        for(Student st : set ) {
            System.out.println(st);
        }
    }
}
