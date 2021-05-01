package pawlak.pawel.codewars.kata.accumul;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {

  public static String accum(final String text) {
    if (text == null) {
      throw new IllegalArgumentException();
    }
    return IntStream.range(0, text.length())
        .mapToObj(i -> singleCharToWord(text.charAt(i), i))
        .collect(Collectors.joining("-"));
  }

  private static String singleCharToWord(final char charAt, final int index) {
    return IntStream.range(0, index + 1)
        .mapToObj(i -> i == 0 ? String.valueOf(charAt).toUpperCase() : String.valueOf(charAt).toLowerCase())
        .collect(Collectors.joining());
  }

}
