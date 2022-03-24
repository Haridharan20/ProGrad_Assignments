import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void addCentimeterToMeter()
    {
       Length meter = new Length(1,"m");
       Length centimeter = new Length(100,"cm");
        System.out.println(meter.addUnits(centimeter));
//       assertEquals(2.0,meter.addUnits(centimeter));
    }
    @Test
    public void addMeterToCentimeter()
    {
        Length meter = new Length(1,"m");
        Length centimeter = new Length(100,"cm");
        System.out.println(centimeter.addUnits(meter));
//       assertEquals(200.0,meter.addUnits(centimeter));
    }
    @Test
    public void checkCentimeterValueEqualToMeter()
    {
        Length meter = new Length(1,"m");
        Length centimeter = new Length(100,"c");
        System.out.println(meter.checkEquals(centimeter));
    }

    @Test
    public void checkKilometerValueEqualToCentimeter()
    {
        Length kilometer = new Length(0.001,"km");
        Length centimeter = new Length(100,"cm");
        System.out.println(centimeter.checkEquals(kilometer));
    }
}