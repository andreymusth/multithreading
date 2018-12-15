import syncr.Counter;
import syncr.CounterThread;

public class Main {

    public static void main(String[] args) {

        Counter c = new Counter();

        CounterThread ct1 = new CounterThread(c);
        CounterThread ct2 = new CounterThread(c);

        ct1.start();
        ct2.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.count);

    }
}
