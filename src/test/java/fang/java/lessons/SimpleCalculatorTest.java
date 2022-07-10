package fang.java.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @Test
    void twoAddTwoEqualsFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.addInt(2, 2));
    }

    @Test
    void threeAddSevenEqualsTen() {
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.addInt(3, 7));
    }
}