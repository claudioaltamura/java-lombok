package de.claudioaltamura.java.lombok;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class WeaponTest {

  @Test
  void test() {
    final var weapon = Weapon.builder().id(1).name("weapon").build();

    assertNotNull(weapon);
 }

}
