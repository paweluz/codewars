package pawlak.pawel.codewars.kata.camelcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CamelCaseTest {

  @Test
  public void tests() {
    assertEquals("camel", CamelCase.camelCase("camel"));
    assertEquals("camel Test", CamelCase.camelCase("camelTest"));
    assertEquals("camel Casing", CamelCase.camelCase("camelCasing"));
    assertEquals("camel Casing Test", CamelCase.camelCase("camelCasingTest"));
    assertEquals("camelcasingtest", CamelCase.camelCase("camelcasingtest"));
  }

}
