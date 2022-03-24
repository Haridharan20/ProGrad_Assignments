import org.junit.Test;

import static org.junit.Assert.*;

public class WeightTest {
    @Test
    public void addGramToKilogram()
    {
        Weight gram = new Weight(10,"g");
        Weight kilogram = new Weight(1,"kg");
        assertEquals(1010.0, gram.addUnits(kilogram),0);
    }

    @Test
    public void checkKilogramEqualsToGram()
    {
        Weight gram = new Weight(100,"g");
        Weight kilogram = new Weight(0.1,"kg");
        assertTrue(gram.checkEquals(kilogram));
    }
    @Test
    public void checkOneGramEqualsToOneGram()
    {
        Weight gram1 = new Weight(1,"g");
        Weight gram2 = new Weight(1,"g");
        assertTrue(gram1.checkEquals(gram2));
    }
    @Test
    public void subtractKilogramtoGram()
    {
        Weight gram = new Weight(500,"g");
        Weight kilogram = new Weight(1.5,"kg");
        assertEquals(1.0, kilogram.subUnits(gram),0);
    }

}