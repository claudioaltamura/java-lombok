package de.claudioaltamura.java.lombok;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TalerTest {

    @Test
    void test() {
        assertThat(Taler.of(2).getNum()).isEqualTo(2);
    }

    @Test
    void testToString() {
        assertThat(Taler.of(2).toString()).isEqualTo("Taler(2)");
    }

}