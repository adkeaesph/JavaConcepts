package org.example.streams_examples.sorting;

import java.util.Comparator;
import java.util.List;

public class SortingWordsByLength {

    private static List<String> sortWordsOrderByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
    }

    private static List<String> sortWordsOrderByLengthAndThenAlphabetically(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo))
                .toList();

    }

    public static void main(String[] args) {
        sortWordsOrderByLength(List.of("Jam", "Bread", "Elephant", "Cat", "Roaster"))
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");
        sortWordsOrderByLengthAndThenAlphabetically(List.of("Jam", "Roaster", "Bread", "Elephant", "Cat", "Roast"))
                .forEach(System.out::println);
    }


}
