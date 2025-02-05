package org.example.streams_examples.uppercase_lowercase;

import java.util.List;

public class Driver {

    public static void main(String[] args) {
        List<String> strings = List.of("Abc", "DEF", "ghi", "AbC");
        strings.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");

        strings.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
