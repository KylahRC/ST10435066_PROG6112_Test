public class RoadAccidentReport extends RoadAccidents
{
    public RoadAccidentReport(String accidentVehicleType, String city, int accidentTotal)
    {
        super(accidentVehicleType, city, accidentTotal);


        System.out.printf("%-15s %-15s%n", "VEHICLE TYPE: " ,accidentVehicleType);
        System.out.printf("%-15s %-15s%n", "CITY: " ,city);
        System.out.printf("%-15s %-15s%n", "ACCIDENT TOTAL: " ,accidentTotal);
    }

}
