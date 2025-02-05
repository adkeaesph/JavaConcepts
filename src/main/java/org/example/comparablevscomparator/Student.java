package org.example.comparablevscomparator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student implements Comparable<Student> {

    private String name;
    private String dateOfBirth;
    private float height;

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.getName());
    }
}
