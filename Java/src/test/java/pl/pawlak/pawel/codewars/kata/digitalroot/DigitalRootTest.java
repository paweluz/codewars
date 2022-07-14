package pl.pawlak.pawel.codewars.kata.digitalroot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DigitalRootTest {

  private int input;
  private int output;

  @Test
  public void test_lessThenZero() {
    Given:
    input = -23;

    Then:
    assertThrows(IllegalArgumentException.class, ()->{
      DigitalRoot.digital_root(input);
    });
  }

  @Test
  public void test_zero() {
    Given:
    input = 0;

    When:
    output = DigitalRoot.digital_root(input);

    Then:
    assertEquals(0, output);
  }

  @Test
  public void testForSingleDigitResult() {
    Given:
    input = 11;

    When:
    output = DigitalRoot.digital_root(input);

    Then:
    assertEquals(2, output);
  }

  @Test
  public void testForNotDoubleDigitResult() {
    Given:
    input = 39;

    When:
    output = DigitalRoot.digital_root(input);

    Then:
    assertEquals(3, output);
  }

  @Test
  public void testForLargeNumber() {
    Given:
    input = 493193;

    When:
    output = DigitalRoot.digital_root(input);

    Then:
    assertEquals(2, output);
  }

  @Test
  public void testForLargeNumber2() {
    Given:
    input = 132189;

    When:
    output = DigitalRoot.digital_root(input);

    Then:
    assertEquals(6, output);
  }

}
