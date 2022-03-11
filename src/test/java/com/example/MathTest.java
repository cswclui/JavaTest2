package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
    static Math m;

    //text fixture
    @BeforeClass
    //run once before all test cases start running
    public static void setup(){
        m = new Math();
    }

    @Test
    public void canAdd() {
        assertEquals(3, m.add(1,2));
    }

    @Test
    public void testDivide() {
        double d = m.divide(6,2,3); //3.0000000000000000000000000000000000001
        double d2 = m.divide(6,2,4); //3.0000000000000000000000000000000000001
        assertEquals(3, d, 0.01); //delta=0.01 (tolerance)
    }

    @Test
    public void testDivisionByZero() {
        double d = m.divide(6,0,3); //3.0000000000000000000000000000000000001

        assertEquals(-9999999, d, 0.01); //delta=0.01 (tolerance)

    }

    @Test
    public void testMultiply() {
        assertEquals(6, m.multiply(2,3));
    }

    @Test
    public void testSubstract() {
        assertEquals(-1, m.subtract(2,3));
    }
}
