package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testCalculateBillFirstSlab() {
        App biller = new App();
        
        assertEquals(60.0, biller.calculateBill(50));
    }

    @Test
    void testCalculateBillSecondSlab() {
        App biller = new App();
        
        assertEquals(220.0, biller.calculateBill(150));
    }

    @Test
    void testCalculateBillThirdSlab() {
        App biller = new App();
        
        assertEquals(670.0, biller.calculateBill(350));
    }

    @Test
    void testCalculateBillZeroUnits() {
        App biller = new App();
        assertEquals(0.0, biller.calculateBill(0));
    }
}

