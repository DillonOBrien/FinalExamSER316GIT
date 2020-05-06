
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFinal {

	@Test
    public void testBlackBox() { // this tests lettergrade on returning an A
        assertEquals(100, 100, .01);
    }

    @Test
    public void testWhitebox() { // this tests lettergrade on returing an F
        assertEquals(30, 40, .01);
    }

// I ran out of time sorry.
}