package org.example.streams_examples.complex_problems;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    private static Map<String, Integer> getNumberOfWordsFromSentence(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
    }

    public static void main(String[] args) {
        System.out.println(getNumberOfWordsFromSentence("Hello hello hey hello hey hi hello"));
        System.out.println(getNumberOfWordsFromSentence("Hello hello hi hello hey hi hello"));
    }
}
