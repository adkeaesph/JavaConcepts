package org.example.comparablevscomparator;

import java.util.Comparator;

public class HeightComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        if(student.getHeight() < t1.getHeight())
            return -1;
        if(student.getHeight() > t1.getHeight())
            return 1;
        return student.getName().compareTo(t1.getName());
    }

}
