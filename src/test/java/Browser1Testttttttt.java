import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Browser1Testttttttt {

    @Test
    void open() {
        Browser1 b = new Browser1();
        assertEquals("Invalid link",b.open("ahmed.com"));

    }
}