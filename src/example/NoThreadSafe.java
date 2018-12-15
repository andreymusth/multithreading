package example;

public class NoThreadSafe {

    private StringBuilder builder = new StringBuilder();

    public void add(String text) {
        builder.append(text);
    }

}
