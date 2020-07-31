package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ButterflyTest {

    Butterfly butterfly;

    @BeforeEach
    void setUp() {
        butterfly = new Butterfly();
    }

    @Test
    void fly() {
        assertTrue(butterfly.canFly());
    }

    @Test
    void makeSound() {
        assertFalse(butterfly.canSing());
    }
}