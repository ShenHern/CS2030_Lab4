class Request {
    private final int dist;
    private final int numPass;
    private final int time;

    Request(int dist, int numPass, int time) {
        this.dist = dist;
        this.numPass = numPass;
        this.time = time;
    }

    public int computeFare(Service service) {
        return service.computeFare(this.dist, this.numPass, this.time);
    }
}

