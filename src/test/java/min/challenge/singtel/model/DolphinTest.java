package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DolphinTest {

    Dolphin dolphin;

    @BeforeEach
    void setUp() {
        dolphin = new Dolphin();
    }

    @Test
    void canSwim() {
        assertTrue(dolphin.canSwim());
    }
}