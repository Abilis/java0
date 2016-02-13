/**
 * Created by Abilis on 13.02.2016.
 */
public class Cat {

    private String name;
    private String color;
    private int age;

    public Cat (String _name, String _color, int _age) {

        name = _name;
        color = _color;
        age = _age;

    }

    public void printInfo () {

        System.out.println("Имя: " + name + ", цвет: " + color + ", возраст: " + age);

    }

    public void meewoo() {
        System.out.println(name + " мяукнул");
    }

    public void run() {
        System.out.println(name + " побежал");
    }

    public void catchMouse() {
        System.out.println(name + " поймал мышь весом " + (int)(((Math.random()) * 9) + 1) + " кг!");
    }

}
