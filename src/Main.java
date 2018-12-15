import example.PeopleQueue;
import example.StopableRunnable;

public class Main {

    public static void main(String[] args) {

        StopableRunnable runnable = new StopableRunnable();
        new Thread(runnable).start();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runnable.doStop();


    }
}
