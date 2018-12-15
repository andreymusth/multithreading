package basic;

public class StopableRunnable implements Runnable {

    private boolean doStop = false;

    public synchronized void doStop() {
        doStop = true;
    }


    @Override
    public void run() {

        while (keepRunning()) {
            System.out.println("Running in " + Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean keepRunning() {
        return !doStop;
    }
}
