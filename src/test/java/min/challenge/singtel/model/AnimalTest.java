package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

    Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Animal();
    }

    @Test
    void walk() {
        animal.walk();
    }
}