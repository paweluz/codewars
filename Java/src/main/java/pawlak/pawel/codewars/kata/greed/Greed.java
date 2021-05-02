package pawlak.pawel.codewars.kata.greed;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Greed {

  static Map<Integer, Function<Long, Long>> values = new HashMap<>();

  static {
    values.put(1, elem -> (elem / 3) * 1000 + (elem % 3) * 100);
    values.put(2, elem -> (elem / 3) * 200);
    values.put(3, elem -> (elem / 3) * 300);
    values.put(4, elem -> (elem / 3) * 400);
    values.put(5, elem -> (elem / 3) * 500 + (elem % 3) * 50);
    values.put(6, elem -> (elem / 3) * 600);
  }

  public static int greedy(int[] dice) {
    final Map<Integer, Long> collect = Arrays.stream(dice).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    return collect.entrySet().stream()
        .map(elem -> values.get(elem.getKey()).apply(elem.getValue()))
        .mapToInt(Long::intValue)
        .sum();

  }

}
