package proxy;

public class TimetableElectricTrainsProxy implements TimetableTrains{

    private TimetableTrains trains;

    @Override
    public String getDepartureTime() {
        if (trains == null) {
            trains = new TimetableElectricTrains();
        }
        return trains.getDepartureTime();
    }
}
