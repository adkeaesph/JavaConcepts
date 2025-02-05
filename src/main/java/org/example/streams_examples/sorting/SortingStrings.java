package org.example.streams_examples.sorting;

import java.util.Comparator;
import java.util.List;

public class SortingStrings {

    public static void main(String[] args) {
        List<String> strings = List.of("Amar", "DEF", "xyz", "Amar", "DEF");
        strings.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");
        strings.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

}
