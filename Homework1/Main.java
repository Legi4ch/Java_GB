package Homework1;


public class Main {


    public static void main(String[] args) {
        Moveable[] members = new Moveable[4];
        members[0] = new Robot("BD",1000,5);
        members[1] = new Robot("Федор",10,1);
        members[2] = new Cat("Мартын",500,2);
        members[3] = new Human("Петр",800,1);



        Test[] tests = new Test[2];
        tests[0] = new Track("Дорожка 1",150);
        tests[1] = new Wall("Стена 1",1);

        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < tests.length; j++) {
                if (tests[j] instanceof Wall) {
                    if (!members[i].jump((Wall) tests[j])) {
                        System.out.println("Участник " + members[i].getName() +" выбывает!");
                        break;
                    }
                } else if (tests[j] instanceof Track) {
                    if (!members[i].run((Track) tests[j])) {
                        System.out.println("Участник " + members[i].getName() +" выбывает!");
                        break;
                    }
                }
            }
        }

    }

}
