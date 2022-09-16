import java.util.List;

class NormalCab implements Driver {
    private final String plateNum;
    private final int waitTime;
    private final ImList<Service> services;

    NormalCab(String plateNum, int waitTime) {
        this.plateNum = plateNum;
        this.waitTime = waitTime;
        this.services = new ImList<Service>(List.of(new JustRide(), new TakeACab()));
    }

    public ImList<Service>  getService() {
        return this.services;
    }
    
}
