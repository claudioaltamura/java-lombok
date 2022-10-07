package de.claudioaltamura.java.lombok;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CityTest {

    @Test
    void testGetter() {
        final var city = new City.CityBuilder().name("Gotham City").build();
        assertThat(city.getName()).isNotNull();
    }

}