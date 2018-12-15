package basic;

public class TwoSums {

    private int sum1 = 0;
    private int sum2 = 0;


    private Integer sumLock1 = new Integer(1);
    private Integer sumLock2 = new Integer(2);

    private void add1(int val1, int val2) {
        synchronized (this) {
            sum1 += val1;
            sum2 += val2;
        }
    }

    private void add2(int val1, int val2) {

        synchronized (sumLock1) {
            sum1 += val1;
        }

        synchronized (sumLock2) {
            sum2 += val2;
        }

    }
}
