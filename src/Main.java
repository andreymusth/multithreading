import example.Counter;

public class Main {

    public static void main(String[] args) {


        Counter counter = new Counter();
        Runnable r1 = () -> counter.add(2);
        Runnable r2 = () -> counter.add(3);

        new Thread(r1).start();
        new Thread(r2).start();

        System.out.println(counter.count);


    }
}
