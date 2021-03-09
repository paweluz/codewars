package pawlak.pawel.codewars.kata.spinwords;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SpinWordsTest {

  private String inputData;
  private String outputData;

  @Test
  public void whenNullDataIsGiven_thenExceptionIsThrown() {
    //given:
    SpinWords spinWords = new SpinWords();

    //then
    assertThrows(IllegalArgumentException.class, () -> {
      spinWords.spinWords(null);
    });
  }

  @Test
  public void whenEmptyStringIsGiven_EmptyStringIsReturned() {
    Given:
    inputData = "";

    When:
    outputData = new SpinWords().spinWords(inputData);

    Then:
    assertEquals(inputData, outputData);
  }

  @Test
  public void whenStringHasLessThenFiveCharacters_ShouldBeReturnedAsSame() {
    Given:
    inputData = "test";

    When:
    outputData = new SpinWords().spinWords(inputData);

    Then:
    assertEquals(inputData, outputData);
  }

  @Test
  public void whenStringHasMoreThenFiveCharacters_ShouldBeReversed() {
    Given:
    inputData = "testingMoreThenFive";

    When:
    outputData = new SpinWords().spinWords(inputData);

    Then:
    assertEquals("eviFnehTeroMgnitset", outputData);
  }

  @Test
  public void whenStringContainsMoreThenOneWordsButEachNotLongerThenFiveCharacters_ShouldBeReturnedAsSame() {
    Given:
    inputData = "test test";

    When:
    outputData = new SpinWords().spinWords(inputData);

    Then:
    assertEquals(inputData, outputData);
  }

  @Test
  public void whenMultiStringIsProvidedIsShouldBeParsedCorrectly() {
    Given:
    inputData = "this is just a testing string data that should hopefully works fantastic";

    When:
    outputData = new SpinWords().spinWords(inputData);

    Then:
    assertEquals("this is just a gnitset gnirts data that dluohs yllufepoh skrow citsatnaf", outputData);
  }

  @Test
  public void whenMultiStringIsProvided_itShouldBeParsedCorrectly2() {
    Given:
    inputData = "   this   d  d    d  ddd   dddd d      ";

    When:
    outputData = new SpinWords().spinWords(inputData);

    Then:
    assertEquals("this   d  d    d  ddd   dddd d", outputData);
  }

  @Test
  public void whenMultiStringIsProvided_itShouldBeParsedCorrectly3() {
    Given:
    inputData = "   this   d  d    d  ddd   dddd d      ";

    When:
    outputData = new SpinWords().spinWords(inputData);

    Then:
    assertEquals("this   d  d    d  ddd   dddd d", outputData);
  }


}
