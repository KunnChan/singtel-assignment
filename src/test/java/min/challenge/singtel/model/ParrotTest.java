package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParrotTest {

    Parrot parrot;

    @BeforeEach
    void setUp() {
        parrot = new Parrot();
    }

    @Test
    void singDog() {
        parrot.sing(new Dog());
    }

    @Test
    void singCat() {
        parrot.sing(new Cat());
    }

    @Test
    void singDuck() {
        parrot.sing(new Duck());
    }

    @Test
    void singRooster() {
        parrot.sing(new Rooster());
    }
}