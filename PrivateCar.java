import java.util.List;

public class PrivateCar implements Driver {
    
    private final String plateNum;
    private final int waitTime;
    private final ImList<Service> services;

    PrivateCar(String plateNum, int waitTime) {
        this.plateNum = plateNum;
        this.waitTime = waitTime;
        this.services = new ImList<Service>(List.of(new JustRide(), new ShareARide()));
    }

    @Override
    public ImList<Service>getService() {
        return this.services;
    }

    @Override
    public Pair<Integer, Service> getFare(Request req) {
        int lowestFare = 0;
        int idx = 0;
        for (int i = 0; i < this.services.size(); i++) {
            int tmp = req.computeFare(services.get(i));
            if (lowestFare == 0 || tmp < lowestFare) {
                lowestFare = tmp;
                idx = i;
            }
        }

        return new Pair<Integer, Service>(lowestFare, services.get(idx));
    }

    @Override
    public Pair<Integer, Service> getSecondFare(Request req) {
        int highestFare = 0;
        int idx = 0;
        for (int i = 0; i < this.services.size(); i++) {
            int tmp = req.computeFare(services.get(i));
            if (tmp > highestFare) {
                highestFare = tmp;
                idx = i;
            }
        }

        return new Pair<Integer, Service>(highestFare, services.get(idx));
    }

    @Override
    public int getWaitTime() {
        return this.waitTime;
    }

    @Override
    public String toString() {
        return String.format("%s (%d mins away) PrivateCar", this.plateNum, this.waitTime);
    }
}
