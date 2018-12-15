import syncr.Counter;
import syncr.CounterThread;

public class Main {

    public static void main(String[] args) {

        ThreadLocal<Counter> t = new ThreadLocal<>();
        t.set(new Counter());
    }
}
