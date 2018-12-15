package signaling;

public class MyWaitNotify2 {

    private final MonitorObject monitorObject = new MonitorObject();
    private boolean wasSignaled = false;

    public void doWait() {
        synchronized (monitorObject) {

            if (!wasSignaled) {

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
