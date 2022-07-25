package pl.pawlak.pawel.codewars.kata.romannumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void test(){

        Assertions.assertEquals(RomanNumerals.toRoman(3438), "MMMCDXXXVIII");
        Assertions.assertEquals(RomanNumerals.fromRoman("MMMCDXXXVIII"), 3438);

    }
}
