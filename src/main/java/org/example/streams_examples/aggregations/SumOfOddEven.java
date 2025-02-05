package org.example.streams_examples.aggregations;

import java.util.List;

public class SumOfOddEven {

    private static int getEvenSum(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static int getOddSum(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(num -> num % 2 != 0)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> list = List.of();
        System.out.println(getEvenSum(list));
        System.out.println(getOddSum(list));
    }
}
