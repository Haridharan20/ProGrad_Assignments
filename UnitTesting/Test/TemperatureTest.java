import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {

    @Test
    public void celciusToFaherinheit()
    {
        Temperature celcius = new Temperature(0,"c");
        System.out.println(celcius.changeScale());

    }
    @Test
    public void FaherinheitToCelcius()
    {

        Temperature faherinheit = new Temperature(32,"f");
        System.out.println(faherinheit.changeScale());

    }
    @Test
    public void KelvinToCelcius()
    {

        Temperature kelvin = new Temperature(0,"k");
        System.out.println(kelvin.changeScale());

    }

}