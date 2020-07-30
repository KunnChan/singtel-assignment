package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DarkTest {

    Dark dark;

    @BeforeEach
    void setUp() {
        dark = new Dark();
    }

    @Test
    void sing() {
        dark.sing();
    }

    @Test
    void swim() {
        dark.swim();
    }

    @Test
    void fly() {
        assertTrue(dark.fly());
    }
}