/**
 * Created by Abilis on 19.02.2016.
 */
public class MainClass {

    public static void main(String[] args) {

        //Создаем по 1 объекту каждого класса
        Cat cat = new Cat("кот", "Матроскин", 100);
        Fish fish = new Fish("рыба", "Матильда", 100);
        Horse horse = new Horse("лошадь", "Шустрая кляча", 100);
        Human human = new Human("человек", "Джон Сноу", 100);
        Parrot parrot = new Parrot("попугай", "Иннокентий", 100);

        double dNumberOfGame = (Math.random() * 100) + 1;
        int numberOfGame = (int) dNumberOfGame;

        System.out.println("Приветствуем всех на " + numberOfGame + " межвидовых играх \"Полоса препятствий\"! " +
                "Давайте посмотрим на участников:");
        cat.getInfo();
        fish.getInfo();
        horse.getInfo();
        human.getInfo();
        parrot.getInfo();

        System.out.println();

        //бег 100м
        System.out.println("В этот раз нашим участникам выпало пробежать 100 метров!");
        cat.run100M();
        fish.run100M();
        horse.run100M();
        human.run100M();
        parrot.run100M();

        System.out.println();

        cat.getInfo();
        fish.getInfo();
        horse.getInfo();
        human.getInfo();
        parrot.getInfo();


    }
}
