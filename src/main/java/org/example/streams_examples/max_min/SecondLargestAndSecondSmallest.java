package org.example.streams_examples.max_min;

import java.util.Comparator;
import java.util.List;

public class SecondLargestAndSecondSmallest {

    private static Integer getSecondSmallest(List<Integer> list) {
        return list.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    private static Integer getSecondLargest(List<Integer> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(123, 456, 897, 62, 21, 789);
//        List<Integer> list = List.of(123);
//        List<Integer> list = List.of();
        System.out.println("Second smallest : " +  getSecondSmallest(list));
        System.out.println("Second largest : " +  getSecondLargest(list));
    }
}
