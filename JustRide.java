class JustRide implements Service {
    private final int centsPerKm = 22;
    private final int numPassengers = 1;
    private final int bookingFee = 0;
    private static final int peakStart = 600;
    private static final int peakEnd = 900;
    
    public int computeFare(int dist, int numPass, int timeOfService) {
        if (timeOfService >= peakStart && timeOfService <= peakEnd) {
            return this.centsPerKm * dist + 500;
        }
        return this.centsPerKm * dist;
    }

    @Override
    public String toString() {
        return "JustRide";
    }
    
}
