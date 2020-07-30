package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DuckTest {

    Duck duck;

    @BeforeEach
    void setUp() {
        duck = new Duck();
    }

    @Test
    void sing() {
        duck.sing();
    }

    @Test
    void swim() {
        duck.swim();
    }

    @Test
    void fly() {
        assertTrue(duck.fly());
    }
}