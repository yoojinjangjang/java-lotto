package lotto.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers.stream().sorted().collect(Collectors.toList());
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        HashSet<Integer> test = new HashSet<>(numbers);
        if (test.size() != 6) {
            throw  new IllegalArgumentException();
        }
    }




    public List<Integer> getNumbers() {
        return numbers;
    }
}
