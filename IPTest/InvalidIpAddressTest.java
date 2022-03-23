package Test;

import com.invalid.InvalidIpAddress;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvalidIpAddressTest {
    @Test
    public void testIsValidIPV4Test1() {
        assertTrue(InvalidIpAddress.isValid("1.1.1.1"));
    }

    @Test
    public void testIsValidIPV4Test2() {
        assertTrue(InvalidIpAddress.isValid("192.168.1.1"));
    }

    @Test
    public void testIsValidIPV4Test3() {
        assertTrue(InvalidIpAddress.isValid("10.0.0.1"));
    }

    @Test
    public void testIsValidIPV4Test4() {
        assertTrue(InvalidIpAddress.isValid("127.0.0.1"));
    }

    @Test
    public void testIsValidIPV4Test5() {
        assertFalse(InvalidIpAddress.isValid("127.#.0.1"));
    }

}