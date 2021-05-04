package pawlak.pawel.codewars.kata.piglatin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {

  public static String pigIt(String str) {
    return Arrays.stream(str.split(" "))
        .map(elem -> elem.matches("(\\w*)") ? (elem.substring(1) + elem.charAt(0) + "ay") : elem)
        .collect(Collectors.joining(" "));
  }

}
