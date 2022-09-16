class TakeACab implements Service {
    private final int centsPerKm = 33;
    private final int bookingFee = 200;

    public int computeFare(int dist, int numPass, int time) {
        return this.centsPerKm * dist + this.bookingFee;
    }

    @Override
    public String toString() {
        return "TakeACab";
    }
}
