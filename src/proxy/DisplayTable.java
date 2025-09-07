package proxy;

public class DisplayTable {
    public static void main(String[] args) {
        TimetableTrains timeTable = new TimetableElectricTrainsProxy();

        System.out.println(timeTable.getDepartureTime());
    }
}
