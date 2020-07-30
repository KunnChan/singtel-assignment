package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class RoosterTest {

    Rooster rooster;

    @BeforeEach
    void setUp() {
        rooster = new Rooster();
    }

    @Test
    void fly() {
        assertFalse(rooster.fly());
    }

    @Test
    void sing() {
        rooster.sing();
    }
}