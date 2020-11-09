package Homework1;

public class Track extends Test {
    private final int MAX_LEN = 2000;
    protected int length;
    protected String name;

    public Track(String name, int length) {
        this.name = name;
        this.length = (length > 0)? length: MAX_LEN;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Беговая дорожка " + name + ". Длина " + length + " метров.";
    }

    @Override
    public boolean doTest(int value) {
        return ( value < this.length ) ? false : true;
    }
}
