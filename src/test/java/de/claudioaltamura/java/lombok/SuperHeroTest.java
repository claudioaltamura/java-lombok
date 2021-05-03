package de.claudioaltamura.java.lombok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class SuperHeroTest {

  @Test
   void testNoArgsConstructor() {
    SuperHero superHero = new SuperHero();

    assertNotNull(superHero);
  }

  @Test
   void testAllArgsConstructor() {
    SuperHero superHero = new SuperHero("Batman", "Gotham City");

    assertEquals("Batman", superHero.getName());
    assertEquals("Gotham City", superHero.getCity());
  }

  @Test
   void testEquals() {
    SuperHero superHero1 = new SuperHero("Flash", "Central City");
    SuperHero superHero2 = new SuperHero("Flash", "Central City");

    assertEquals(superHero1, superHero2);
  }

  @Test
   void testToString() {
    SuperHero superHero = new SuperHero("Superman", "Metropolis");

    assertEquals("SuperHero(name=Superman, city=Metropolis)", superHero.toString());
  }

}
