package pawlak.pawel.codewars.kata.accumul;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AccumulTest {

  private String input;

  @Test
  public void testWhenGivenNullAsInput() {
    assertThrows(IllegalArgumentException.class, () -> {
      Accumul.accum(null);
    });
  }

  @Test
  public void testEmptyString(){
    When:
    input = "";

    Then:
    assertEquals("", Accumul.accum(input));
  }


  @Test
  public void testSingleCharacter(){
    When:
    input = "a";

    Then:
    assertEquals("A", Accumul.accum(input));
  }

  @Test
  public void testTwoCharacters(){
    When:
    input = "ab";

    Then:
    assertEquals("A-Bb", Accumul.accum(input));
  }

  private static void testing(String actual, String expected) {
    assertEquals(expected, actual);
  }
  @Test
  public void testMany() {
    System.out.println("Fixed Tests accum");
    testing(Accumul.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
    testing(Accumul.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
    testing(Accumul.accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
    testing(Accumul.accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
    testing(Accumul.accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
  }

}
