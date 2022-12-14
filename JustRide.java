class JustRide implements Service {
    private static final int CENTSPERKM = 22;
    private static final int PEAKSTART = 600;
    private static final int PEAKEND = 900;
    private static final int SURGE = 500;
    
    public int computeFare(int dist, int numPass, int timeOfService) {
        if (timeOfService >= PEAKSTART && timeOfService <= PEAKEND) {
            return CENTSPERKM * dist + SURGE;
        }
        return CENTSPERKM * dist;
    }

    @Override
    public String toString() {
        return "JustRide";
    }
    
}
