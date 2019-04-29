package de.claudioaltamura.java.lombok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class SuperHeroTest {

  @Test
  public void testNoArgsConstructor() {
    SuperHero superHero = new SuperHero();

    assertNotNull(superHero);
  }

  @Test
  public void testAllArgsConstructor() {
    SuperHero superHero = new SuperHero("Batman", "Gotham City");

    assertEquals("Batman", superHero.getName());
    assertEquals("Gotham City", superHero.getCity());
  }

}
