public class ShareARide implements Service {
    private static final int CENTSPERKM = 50;
    private static final int PEAKSTART = 600;
    private static final int PEAKEND = 900;
    
    @Override
    public int computeFare(int dist, int numPass, int time) {
        if (time >= PEAKSTART && time <= PEAKEND) {
            return (CENTSPERKM * dist + 500) / numPass;
        }
        return (CENTSPERKM * dist) / numPass;
    }

    @Override
    public String toString() {
        return "ShareARide";
    }
}
