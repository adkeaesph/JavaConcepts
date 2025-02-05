package org.example.streams_examples.key_value;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringAndItsLength {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "dog", "bread", "lamb", "elephant");
        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap(word -> word, String::length));

        for(Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.println(element.getKey() + " -> " + element.getValue());
        }
    }
}
