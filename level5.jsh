void findBestBooking(Request req, List<Driver> list) {
    ImList<Booking> bookingList = new ImList<Booking>();
    for (Driver d : list) {
        Booking b1 = new Booking(d, req);
        Booking b2 = b1.secondFare();
        bookingList = bookingList.add(b1);
        bookingList = bookingList.add(b2);
    }
    
    bookingList = bookingList.sort(new BookingComp());
    for (Booking b : bookingList) {
        System.out.println(b.toString());
    }
}