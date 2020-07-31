package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClownfishTest {

    Clownfish clownfish;

    @BeforeEach
    void setUp() {
        clownfish = new Clownfish();
    }

    @Test
    void size() {
        assertEquals("small", clownfish.getSize());
    }

    @Test
    void color() {
        assertEquals("orange", clownfish.getColor());
    }

    @Test
    void canSwim() {
        assertTrue(clownfish.canSwim());
    }
}