package syncr;

public class Counter {

    public long count = 0;

    public synchronized void add(long val) {
        count += val;
    }
}
