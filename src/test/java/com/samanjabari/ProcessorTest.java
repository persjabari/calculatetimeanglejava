package com.samanjabari;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessorTest {

    @Test
    void hourMinuteAngleSumTest() {
        assertEquals(90, Processor.hourMinuteAngleSum(3, 0));
        assertEquals(420, Processor.hourMinuteAngleSum(4, 50));
        assertEquals(330, Processor.hourMinuteAngleSum(10, 5));
        assertEquals(360, Processor.hourMinuteAngleSum(6, 30));
        assertEquals(180, Processor.hourMinuteAngleSum(2, 20));
    }

    @Test
    void minuteAngleTest() {
        assertEquals(0, Processor.minuteAngle(0));
        assertEquals(300, Processor.minuteAngle(50));
        assertEquals(30, Processor.minuteAngle(5));
        assertEquals(180, Processor.minuteAngle(30));
        assertEquals(120, Processor.minuteAngle(20));
    }

    @Test
    void hourAngleTest() {
        assertEquals(90, Processor.hourAngle(3));
        assertEquals(120, Processor.hourAngle(4));
        assertEquals(300, Processor.hourAngle(10));
        assertEquals(180, Processor.hourAngle(6));
        assertEquals(60, Processor.hourAngle(2));
    }
}
