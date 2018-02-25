package tests;

import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    Time time1;
    Time time2;
    Time time3;

    @Before
    public void setUp() throws Exception {
        time1 = new Time(3,34);
        time2 = new Time(20,10);
        time3 = new Time(12,01);
    }

    @Test
    public void getTime() {
        assertEquals("3:34 AM", time1.getTime());
        assertEquals("8:10 PM", time2.getTime());
    }
}