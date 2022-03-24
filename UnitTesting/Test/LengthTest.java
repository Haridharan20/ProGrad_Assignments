import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void addCentimeterToMeter()
    {
       Length meter = new Length(1,"m");
       Length centimeter = new Length(100,"cm");
        System.out.println(meter.addUnits(centimeter));
       assertEquals(2.0,meter.addUnits(centimeter),0);
    }
    @Test
    public void addMeterToCentimeter()
    {
        Length meter = new Length(1,"m");
        Length centimeter = new Length(100,"cm");
        System.out.println(centimeter.addUnits(meter));
       assertEquals(2.0,meter.addUnits(centimeter),0);
    }
    @Test
    public void checkCentimeterValueEqualToMeter()
    {
        Length meter = new Length(1,"m");
        Length centimeter = new Length(100,"cm");
        System.out.println(meter.checkEquals(centimeter));
        assertTrue(meter.checkEquals(centimeter));
    }
    @Test
    public void subtractMeterToCentimeter() {
        Length meter = new Length(1, "m");
        Length centimeter = new Length(50, "cm");
        assertEquals(0.5, meter.subUnits(centimeter), 0);
    }
    @Test
    public void subtractCentimeterToMeter() {
        Length meter = new Length(1, "m");
        Length centimeter = new Length(2000, "cm");
        assertEquals(1900.0, centimeter.subUnits(meter), 0);
    }

    @Test
    public void checkCentimeterValueEqualToCentiMeter() {
        Length centimeter1 = new Length(1, "cm");
        Length centimeter2 = new Length(1, "cm");
        assertTrue(centimeter1.checkEquals(centimeter2));
    }

    @Test
    public void addCentimeterToKiloMeter() {
        Length kilometer = new Length(1, "km");
        Length centimeter = new Length(200, "cm");
        assertEquals(100200.0, centimeter.addUnits(kilometer), 0);
    }

    @Test
    public void checkKilometerValueEqualToCentimeter()
    {
        Length kilometer = new Length(0.001,"km");
        Length centimeter = new Length(100,"cm");
        System.out.println(centimeter.checkEquals(kilometer));
        assertTrue(centimeter.checkEquals(kilometer));
    }
}