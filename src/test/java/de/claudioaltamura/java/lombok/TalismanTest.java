package de.claudioaltamura.java.lombok;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TalismanTest {

    @Test
    void test() {
        var rabbitFoot = Talisman.builder().name("Rabbit foot").build();

        assertThat(rabbitFoot.getName()).isEqualTo("Rabbit foot");
        assertThat(rabbitFoot.getCreated()).isGreaterThanOrEqualTo(0);
    }
}