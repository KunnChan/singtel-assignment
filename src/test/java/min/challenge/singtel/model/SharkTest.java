package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SharkTest {

    Shark shark;

    @BeforeEach
    void setUp() {
        shark = new Shark();
    }

    @Test
    void size() {
        assertEquals("large", shark.getSize());
    }

    @Test
    void color() {
        assertEquals("grey", shark.getColor());
    }

    @Test
    void canSwim() {
        assertTrue(shark.canSwim());
    }
}