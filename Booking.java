public class Booking implements Comparable<Booking> {
    private final int fare;
    private final Request req;
    private final Driver driver;
    private final Service s;

    Booking(Driver driver, Request req) {
        this.driver = driver;
        this.req = req;
        Pair<Integer, Service> pr = driver.getFare(req);
        this.fare = pr.first();
        this.s = pr.second(); 
    }

    private Booking(int fare, Request req, Driver driver, Service s) {
        this.fare = fare;
        this.req = req;
        this.driver = driver;
        this.s = s;
    }

    @Override
    public int compareTo(Booking other) {
        if (this.fare == other.fare) {
            return this.driver.getWaitTime() - other.driver.getWaitTime();
        }
        return this.fare - other.fare;
    }

    public Booking secondFare() {
        Pair<Integer, Service> pr = this.driver.getSecondFare(this.req);
        return new Booking(pr.first(), this.req, this.driver, pr.second());
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
