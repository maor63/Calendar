package tests;

import model.Date;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {
    Date date1;
    Date date2;
    Date date3;
    Date date4;
    @Before
    public void setup(){
        date1 = new Date(4,21,1999);
        date2 = new Date(12,21,1999);
        date3 = new Date(4,3,1999);
        date4 = new Date(7,12,2007);
    }

    @Test
    public void getShortFormatDate() {
        assertEquals("21-04-1999", date1.getShortFormatDate());
        assertEquals("21-12-1999", date2.getShortFormatDate());
        assertEquals("03-04-1999", date3.getShortFormatDate());
        assertEquals("12-07-2007", date4.getShortFormatDate());
    }

    @Test
    public void getLongFormatDate() {
        assertEquals("April 21, 1999", date1.getLongFormatDate());
        assertEquals("December 21, 1999", date2.getLongFormatDate());
        assertEquals("April 3, 1999", date3.getLongFormatDate());
        assertEquals("July 12, 2007", date4.getLongFormatDate());
    }
}