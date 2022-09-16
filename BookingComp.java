import java.util.Comparator;

public class BookingComp implements Comparator<Booking> {

    @Override
    public int compare(Booking a, Booking b) {
        return a.compareTo(b);
    }
}
