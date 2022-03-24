public class Temperature extends Measurement{
    public Temperature(double value, String unit) {
        super(value, unit);
    }

    public double changeScale()
    {
        if(this.unit.equalsIgnoreCase("c"))
        {
            return (this.value * 9/5) + 32;
        }
        if(this.unit.equalsIgnoreCase("f"))
        {
            return (this.value - 32) * 5/9;
        }
        if(this.unit.equalsIgnoreCase("k"))
        {
            return this.value - 273.15;
        }
        return 1.0;

    }

    @Override
    public double addUnits(Measurement otherUnit) {
        return 0;
    }

    @Override
    public double subUnits(Measurement otherUnit) {
        return 0;
    }

    @Override
    public boolean checkEquals(Measurement otherUnit) {
        return false;
    }
}
