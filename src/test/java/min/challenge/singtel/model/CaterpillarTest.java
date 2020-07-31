package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CaterpillarTest {

    Caterpillar caterpillar;

    @BeforeEach
    void setUp() {
        caterpillar = new Caterpillar();
    }

    @Test
    void canFly() {
        assertFalse(caterpillar.canFly());
    }

    @Test
    void walk() {
        assertTrue(caterpillar.canWalk());
    }
}