package pawlak.pawel.codewars.kata.findoutlier;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOutlier {

  static int find(int[] integers) {
    if (integers == null || integers.length < 3) {
      throw new IllegalArgumentException();
    }
    final Map<Boolean, List<Integer>> dataGroupedBy = Arrays.stream(integers).boxed()
        .collect(Collectors.partitioningBy(elem -> elem % 2 == 0, toList()));
    return dataGroupedBy.values().stream()
        .filter(list -> list.size() == 1)
        .map(elem -> elem.get(0)).findFirst().orElseThrow(IllegalArgumentException::new);
  }

}
