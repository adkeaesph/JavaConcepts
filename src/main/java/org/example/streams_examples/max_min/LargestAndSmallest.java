package org.example.streams_examples.max_min;

import java.util.List;

public class LargestAndSmallest {
    public static void main(String[] args) {
        List<Integer> list = List.of(123, 456, 897, 62, 21, 789);
        int min = list.stream().min(Integer::compare).get();
        int max = list.stream().max(Integer::compareTo).get();
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
