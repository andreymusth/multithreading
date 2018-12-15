package signaling;

public class MyWaitNotify3 {

    private final MonitorObject monitorObject = new MonitorObject();
    private boolean wasSignaled = false;

    public void doWait() {
        synchronized (monitorObject) {

            while (!wasSignaled) {

                try {
                    monitorObject.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            wasSignaled = false;
        }
    }

    public void doNotify() {
        synchronized (monitorObject) {
            monitorObject.notify();
            wasSignaled = true;
        }
    }
}
