package pawlak.pawel.codewars.kata.enoughisenough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {

  public static int[] deleteNth(int[] elements, int maxOccurrences) {
    final Map<Integer, Integer> map = new HashMap<>();
    final List<Integer> result = new ArrayList<>();
    for (Integer elem : elements) {
      if (map.merge(elem, 1, Integer::sum) <= maxOccurrences) {
        result.add(elem);
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

}
