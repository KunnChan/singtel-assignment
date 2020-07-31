package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class ChickenTest {

    Chicken chicken;

    @BeforeEach
    void setUp() {
        chicken = new Chicken();
    }

    @Test
    void sing() {
        chicken.sing();
    }

    @Test
    void fly() {
        assertFalse(chicken.canFly());
    }
}