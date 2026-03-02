package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAdd() {
        App app = new App();
        assertEquals(15, app.add(10, 5));
    }

    @Test
    void testSubtract() {
        App app = new App();
        assertEquals(5, app.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        App app = new App();
        assertEquals(50, app.multiply(10, 5));
    }

    @Test
    void testDivide() {
        App app = new App();
        assertEquals(2, app.divide(10, 5));
    }
}
