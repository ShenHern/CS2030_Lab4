public class Pair<T, U> {
    private final T first;
    private final U second;

    Pair(T t, U u) {
        this.first = t;
        this.second = u;
    }

    public T first() {
        return this.first;
    }

    public U second() {
        return this.second;
    }
}
