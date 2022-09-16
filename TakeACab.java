class TakeACab implements Service {
    private static final int CENTSPERKM = 33;
    private static final int BOOKINGFEE = 200;

    public int computeFare(int dist, int numPass, int time) {
        return CENTSPERKM * dist + BOOKINGFEE;
    }

    @Override
    public String toString() {
        return "TakeACab";
    }
}
