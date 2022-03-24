public class Length extends Measurement {
    public Length(double value, String unit) {
        super(value, unit);
    }

    public double convert(String unit,Measurement otherUnit) {
        if((unit == "m") && (otherUnit.unit == "m"))
        {
            return otherUnit.value;
        }
        else if((unit == "m") && (otherUnit.unit == "cm"))
        {
            return otherUnit.value/100;
        }
        else if((unit == "cm") && (otherUnit.unit == "cm"))
        {
            return otherUnit.value;
        }
        else if((unit == "cm") && (otherUnit.unit == "m")) {
            return otherUnit.value * 100;
        }
        else if((unit == "cm") && (otherUnit.unit == "km")) {
            return otherUnit.value * 100_000;
        }
        else if((unit == "km") && (otherUnit.unit == "cm")) {
            return otherUnit.value / 100000;
        }
        return 1.0;
    }

    @Override
    public double addUnits(Measurement otherUnit) {
        double ans = this.value+convert(this.unit,otherUnit);
        return ans;
    }

    @Override
    public double subUnits(Measurement otherUnit) {
        double ans = this.value - convert(this.unit, otherUnit);
        return ans;
    }

    @Override
    public boolean checkEquals(Measurement otherUnit)
    {

        return this.value==convert(this.unit,otherUnit);
    }
}
