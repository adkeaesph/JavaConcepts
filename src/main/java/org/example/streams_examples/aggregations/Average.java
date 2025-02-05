package org.example.streams_examples.aggregations;

import java.util.List;
import java.util.Objects;

public class Average {

    private static double getAverage(List<Integer> numbers) throws Exception {
//        return numbers.stream().reduce(0, (partialSum, element) -> partialSum + element);
        if(Objects.isNull(numbers) || numbers.isEmpty())
            throw new Exception("Given list must have at least 1 element");

        return (double) numbers.stream().reduce(0, Integer::sum) / numbers.size();
    }

    private static  double getAveragePredefined(List<Integer> numbers) {
        return numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getAverage(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println(getAverage(List.of(45)));
        System.out.println(getAverage(List.of()));
    }
}
