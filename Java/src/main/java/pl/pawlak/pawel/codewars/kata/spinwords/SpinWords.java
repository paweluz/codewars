package pl.pawlak.pawel.codewars.kata.spinwords;

import static java.util.stream.Collectors.joining;

import java.util.Arrays;

public class SpinWords {

  private static final int SPIN_SINCE = 5;

  public String spinWords(final String inputData) {
    if (inputData == null) {
      throw new IllegalArgumentException();
    }

    return Arrays.stream(inputData.split(" "))
        .map(this::reverseIfNeeded)
        .collect(joining(" ")).trim();
  }

  private String reverseIfNeeded(String word) {
    if (word.length() >= SPIN_SINCE) {
      return new StringBuilder(word).reverse().toString();
    }
    return word;
  }


}
