import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {
    @Test
    public void celciusToFaherinheit() {
        Temperature celcius = new Temperature(0, "c");
        assertEquals(32.0, celcius.changeScale(), 0);

    }

    @Test
    public void FaherinheitToCelcius() {

        Temperature faherinheit = new Temperature(32, "f");
        assertEquals(0.0, faherinheit.changeScale(), 0);

    }

    @Test
    public void KelvinToCelcius() {

        Temperature kelvin = new Temperature(0, "k");
        assertEquals(-273.0, kelvin.changeScale(), 0);

    }

}