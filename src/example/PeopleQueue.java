package example;

import java.util.concurrent.TimeUnit;

public class PeopleQueue extends Thread {

    private String[] names;

    public PeopleQueue(String... names) {
        this.names = names;
    }


    @Override
    public void run() {
        for (String name : names) {
            System.out.println("Proceed docs " + name);

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
