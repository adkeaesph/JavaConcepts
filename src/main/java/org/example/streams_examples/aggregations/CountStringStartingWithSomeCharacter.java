package org.example.streams_examples.aggregations;

import java.util.List;

public class CountStringStartingWithSomeCharacter {

    private static long getCountOfStringsStartingWith(String key, List<String> strings) {
        return strings.stream()
                .filter(string -> string.startsWith(key))
                .count();
    }

    public static void main(String[] args) {
        System.out.println(getCountOfStringsStartingWith("A",
                List.of("Alohomora", "Ajay", "Nando", "Lama", "alapaca", "Alan")));

        System.out.println(getCountOfStringsStartingWith("a",
                List.of("Alohomora", "Ajay", "Nando", "Lama", "alapaca", "Alan")));

        System.out.println(getCountOfStringsStartingWith("Al",
                List.of("Alohomora", "Ajay", "Nando", "Lama", "alapaca", "Alan")));
    }


}
