interface Driver {

    ImList<Service> getService();

    Pair<Integer, Service>getFare(Request request);

    int getWaitTime();

    Pair<Integer, Service>getSecondFare(Request request);
}
