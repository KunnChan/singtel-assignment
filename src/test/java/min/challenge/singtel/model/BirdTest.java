package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BirdTest {

    Bird bird;

    @BeforeEach
    void setUp() {
        bird = new Bird();
    }

    @Test
    void fly() {
        bird.fly();
    }

    @Test
    void sing() {
        bird.sing();
    }
}