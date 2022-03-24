public class Weight extends Measurement{
    public Weight(double value, String unit) {
        super(value, unit);
    }

    public double convert(String unit, Measurement otherUnit) {
        if((unit == "g") && (otherUnit.unit == "g"))
        {
            return otherUnit.value;
        }
        else if((unit == "g") && (otherUnit.unit == "kg"))
        {
            return otherUnit.value*1000;
        }
        else if((unit == "kg") && (otherUnit.unit == "kg"))
        {
            return otherUnit.value;
        }
        else if((unit == "kg") && (otherUnit.unit == "g")) {
            return otherUnit.value/1000;
        }

        return 1.0;
    }
    @Override
    public double addUnits(Measurement otherUnit) {
        return this.value+convert(this.unit,otherUnit);
    }

    @Override
    public double subUnits(Measurement otherUnit) {
        return this.value-convert(this.unit,otherUnit);
    }

    @Override
    public boolean checkEquals(Measurement otherUnit)
    {

        return this.value==convert(this.unit,otherUnit);
    }

}
