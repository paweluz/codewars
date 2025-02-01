package pl.pawlak.pawel.codewars.kata.camelcase;

import java.util.stream.Collectors;

public class CamelCase {

  public static String camelCase(String input) {
    return input.chars()
        .mapToObj(i -> (char) i)
        .map(CamelCase::addSpaceIfNeeded)
        .collect(Collectors.joining()).trim();
  }

  private static String addSpaceIfNeeded(char character) {
    return Character.isUpperCase(character) ? " " + character : String.valueOf(character);
  }
}
