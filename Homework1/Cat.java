package Homework1;

public class Cat implements Moveable{
    protected String name;
    protected int maxRun;
    protected int maxJump;

    public Cat(String name,int maxRun,int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.doTest(this.maxJump)) {
            System.out.println(this.name + " перепрыгнул через стену " + wall.getName() + " высотой " + wall.getHeight() + " метров!");
            return true;
        }
        else {
            System.out.println("Стена " + wall.name + " слишком высокая для " + this.name);
            return false;
        }
    }

    @Override
    public boolean run(Track track) {
        if (track.doTest(this.maxRun)) {
            System.out.println(this.name + " пробежал по " +  track.getName() + " длиной " + track.getLength() + " метров!" );
            return true;
        } else {
            System.out.println("Дорожка " + track.name + " слишком длинная для " + this.name);
            return false;
        }
    }


}
