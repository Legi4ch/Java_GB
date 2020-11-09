package Homework1;

public class Wall extends Test {
    private final int MAX_HEIGHT = 2;
    protected int height;
    protected String name;

    public Wall(String name, int height) {
        this.name = name;
        this.height = (height > 0)? height: MAX_HEIGHT;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Стена " + name + ". Высота " + height + " метров.";
    }

    @Override
    public boolean doTest(int value) {
        return (value < this.height) ? false: true;
    }
}
