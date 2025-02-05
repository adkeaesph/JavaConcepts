package org.example.streams_examples.remove_duplicates;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<String> strings = List.of("Amar", "DEF", "Amar", "DEF", "Amar", "xyz");
        strings.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
