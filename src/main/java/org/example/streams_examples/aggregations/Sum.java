package org.example.streams_examples.aggregations;

import java.util.List;

public class Sum {

    private static int getSum(List<Integer> numbers) {
//        return numbers.stream().reduce(0, (partialSum, element) -> partialSum + element);
        return numbers.stream().reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(getSum(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println(getSum(List.of(45)));
        System.out.println(getSum(List.of()));
    }
}
