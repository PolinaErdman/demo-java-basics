package by.onliner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers = List.of(1, 3, 5, 0, -2, 15, -4);
        List<Integer> result = numbers.stream().filter(x -> x < 0)
                .toList();
        System.out.println(result);
    }
}
