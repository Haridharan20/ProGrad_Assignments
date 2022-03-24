import org.junit.Test;

import static org.junit.Assert.*;

public class WeightTest {
    @Test
    public void addKilogramToGram()
    {
        Weight gram = new Weight(10,"g");
        Weight kilogram = new Weight(1,"kg");
        System.out.println(gram.addUnits(kilogram));
    }
    @Test
    public void addGramToKilogram()
    {
        Weight gram = new Weight(10,"g");
        Weight kilogram = new Weight(1,"kg");
        System.out.println(kilogram.addUnits(gram));
    }

    @Test
    public void checkKilogramEqualsToGram()
    {
        Weight gram = new Weight(1000,"g");
        Weight kilogram = new Weight(1,"kg");
        System.out.println(kilogram.checkEquals(gram));
    }

}