package basic;

public class NoThreadSafe {

    private StringBuilder builder = new StringBuilder();

    public void add(String text) {
        builder.append(text);
    }

}
