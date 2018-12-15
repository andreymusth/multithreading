package volat;

public class MyClass {

    private int years;
    private int month;
    private volatile int days;

    public void update(int years, int month, int days) {
        this.years = years;
        this.month = month;
        this.days = days;
    }

    public int totalDays() {
        int total = days;
        total += month * 30;
        total += years * 365;

        return total;
    }
}
