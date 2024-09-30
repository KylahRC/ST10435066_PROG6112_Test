public class RoadAccidents implements IRoadAccidents
{
    String accidentVehicleType;
    String city;
    int accidentTotal;

    public RoadAccidents(String accidentVehicleType, String city, int accidentTotal)
    {
        this.accidentVehicleType = accidentVehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    @Override public String getAccidentVehicleType()
    {
        return accidentVehicleType;
    }

    @Override public String getCity()
    {
        return city;
    }

    @Override public int getAccidentTotal()
    {
        return accidentTotal;
    }
}
