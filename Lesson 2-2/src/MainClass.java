/**
 * Created by Abilis on 13.02.2016.
 */
public class MainClass {

    public static void main(String[] args) {

        Cat c1 = new Cat("Барсик", "красный", 3);
        Cat c2 = new Cat("Мурзик", "черный", 2);

        c1.printInfo();
        c2.printInfo();

        c1.meewoo();

        c2.run();

        c1.catchMouse();

    }


}
