package pl.pawlak.pawel.codewars.kata.findoutlier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FindOutlierTest {

  int[] input;
  int output;

  @Test
  public void whenInputIsNull_exceptionIsThrown() {
    //given:
    input = null;

    //then
    assertThrows(IllegalArgumentException.class, () -> {
      FindOutlier.find(input);
    });
  }

  @Test
  public void whenInputIsNotLongEnough_exceptionIsThrown() {
    //given:
    input = new int[] {2, 3};

    //then
    assertThrows(IllegalArgumentException.class, () -> {
      FindOutlier.find(input);
    });
  }

  @Test
  public void test1() {
    Given:
    input = new int[] {Integer.MAX_VALUE, 0, 1};

    When:
    output = FindOutlier.find(input);

    Then:
    assertEquals(0, output);
  }

  @Test
  public void test2() {
    Given:
    input = new int[] {5, 6, 3};

    When:
    output = FindOutlier.find(input);

    Then:
    assertEquals(6, output);
  }

  @Test
  public void test3() {
    Given:
    input = new int[] {2, 6, 8, -10, 3};

    When:
    output = FindOutlier.find(input);

    Then:
    assertEquals(3, output);
  }

  @Test
  public void test4() {
    Given:
    input = new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};

    When:
    output = FindOutlier.find(input);

    Then:
    assertEquals(206847684, output);
  }

  @Test
  public void test5() {
    Given:
    input = new int[] {0, 6, -3};

    When:
    output = FindOutlier.find(input);

    Then:
    assertEquals(-3, output);
  }

}
