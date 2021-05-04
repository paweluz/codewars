package pawlak.pawel.codewars.kata.piglatin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PigLatinTest {

  @Test
  public void test(){
    assertEquals("igPay atinlay siay oolcay !", PigLatin.pigIt("Pig latin is cool !"));
    assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
  }

}
