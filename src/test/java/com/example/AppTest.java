package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testGradeA() {
        App app = new App();
        assertEquals("A", app.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        App app = new App();
        assertEquals("B", app.calculateGrade(82));
    }

    @Test
    void testGradeC() {
        App app = new App();
        assertEquals("C", app.calculateGrade(75));
    }

    @Test
    void testGradeD() {
        App app = new App();
        assertEquals("D", app.calculateGrade(60));
    }

    @Test
    void testGradeF() {
        App app = new App();
        assertEquals("F", app.calculateGrade(45));
    }
}
