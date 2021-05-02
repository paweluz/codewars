package pawlak.pawel.codewars.kata.greed;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreedTest {

  @Test
  public void test() {
    int[] inputData = new int[] {1, 2, 1, 1, 5};

    assertEquals(1050, Greed.greedy(inputData));
    assertEquals(250, Greed.greedy(new int[]{5,1,3,4,1}));
    assertEquals(1100, Greed.greedy(new int[]{1,1,1,3,1}));
    assertEquals(450, Greed.greedy(new int[]{2,4,4,5,4}));

  }

}
