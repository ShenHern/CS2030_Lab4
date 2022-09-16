public class Booking implements Comparable<Booking> {
    private final int fare;
    private final Driver driver;
    private final Request req;
    private final Service s;

    Booking(Driver driver, Request req) {
        this.driver = driver;
        this.req = req;
        Pair<Integer, Service> pr = driver.getFare(req);
        this.fare = pr.first();
        this.s = pr.second(); 
    }

    @Override
    public int compareTo(Booking other) {
        if (this.fare == other.fare) {
            return this.driver.getWaitTime() - other.driver.getWaitTime();
        }
        return this.fare - other.fare;
    }

    @Override
    public String toString() {
        return String.format("$%.2f using %s (%s)", 
        this.fare / 100.0, 
        this.driver.toString(), 
        this.s.toString()
        );
    }
}
