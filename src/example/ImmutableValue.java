package example;

public class ImmutableValue {

    private int value = 0;

    public ImmutableValue(int val) {
        value = val;
    }


    public int getValue() {
        return value;
    }


    public ImmutableValue add(int valueToAdd) {
        return new ImmutableValue(value + valueToAdd);
    }
}
