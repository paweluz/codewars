package pl.pawlak.pawel.codewars.kata.digitalroot;

public class DigitalRoot {

  private static final int MAX_RESULT_VALUE = 9;

  public static int digital_root(int n) {
    if (n < 0){
      throw new IllegalArgumentException();
    }
    int result = n;
    while (result > MAX_RESULT_VALUE) {
      result = sum(result);
    }
    return result;
  }

  private static int sum(int value) {
    return String.valueOf(value).chars().map(Character::getNumericValue).sum();
  }


}
