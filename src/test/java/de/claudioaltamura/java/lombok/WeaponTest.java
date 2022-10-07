package de.claudioaltamura.java.lombok;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WeaponTest {

    @Test
    void testInternalBuilder() {
        final var w1 =  Weapon.builder("W1").build();
        assertThat(w1.getName()).isNotEmpty();
    }

}