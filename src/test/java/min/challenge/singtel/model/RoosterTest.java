package min.challenge.singtel.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class RoosterTest {

    Rooster rooster;

    @BeforeEach
    void setUp() {
        rooster = new Rooster();
    }

    @Test
    void fly() {
        assertFalse(rooster.canFly());
    }

    @Test
    void sing() {
        rooster.sing();
    }

    @Test
    void singOverLanguage() {
        assertEquals("kukeleku", rooster.singOverLanguage("Dutch"));
        assertEquals("coo-koo-ri-koo", rooster.singOverLanguage("Hebrew"));
        assertEquals("ko-ke-kok-ko-o", rooster.singOverLanguage("Japanese"));
    }
}