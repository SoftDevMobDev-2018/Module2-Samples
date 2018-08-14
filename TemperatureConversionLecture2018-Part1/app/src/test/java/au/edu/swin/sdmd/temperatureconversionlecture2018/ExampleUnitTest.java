package au.edu.swin.sdmd.temperatureconversionlecture2018;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void conversion_zero() {

        Conversion c = new Conversion();
        assertEquals("32.00", c.toFahrenheit("0"));
    }

    @Test
    public void conversion_empty() {

        Conversion c = new Conversion();
        assertEquals("ERR", c.toFahrenheit(""));
    }

    @Test
    public void conversion_neg40() {

        Conversion c = new Conversion();
        assertEquals("-40.00", c.toFahrenheit("-40"));
    }

    @Test
    public void conversion_string() {

        Conversion c = new Conversion();
        assertEquals("ERR", c.toFahrenheit("abc"));
    }

    @Test
    public void conversion_37() {

        Conversion c = new Conversion();
        assertEquals("100.04", c.toFahrenheit("37.8"));
    }
}