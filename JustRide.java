class JustRide implements Service {
    private final int centsPerKm = 22;
    private final int numPassengers = 1;
    private final int bookingFee = 0;
    
    public int computeFare(int dist, int numPass, int timeOfService) {
        if (timeOfService >= 600 && timeOfService <= 900) {
            return this.centsPerKm * dist + 500;
        }
        return this.centsPerKm * dist;
    }
    
}
