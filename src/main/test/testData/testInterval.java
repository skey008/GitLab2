package edu.odu.cs;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class testInterval {
    public void testConstructor {
        Interval interval = new Interval(2, 4);

        assertEquals(interval.getMax, 4);
        assertEquals(interval.getMin, 2);
    }
}