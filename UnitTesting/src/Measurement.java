public abstract class Measurement {
    double value;
    String unit;

    public Measurement(double value,String unit)
    {
        this.value=value;
        this.unit=unit;
    }

    public abstract double addUnits(Measurement otherUnit);
    public abstract double subUnits(Measurement otherUnit);
    public abstract boolean checkEquals(Measurement otherUnit);
}
