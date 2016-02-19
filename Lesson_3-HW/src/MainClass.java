/**
 * Created by Abilis on 19.02.2016.
 */
public class MainClass {

    //Создаем по 1 объекту каждого класса
    public static Cat cat = new Cat("кот", "Матроскин", 100);
    public static Fish fish = new Fish("рыба", "Матильда", 100);
    public static Horse horse = new Horse("лошадь", "Шустрая кляча", 100);
    public static Human human = new Human("человек", "Джон Сноу", 100);
    public static Parrot parrot = new Parrot("попугай", "Иннокентий", 100);

    public static void main(String[] args) {



        double dNumberOfGame = (Math.random() * 100) + 1;
        int numberOfGame = (int) dNumberOfGame;

        System.out.println("Приветствуем всех на " + numberOfGame + " межвидовых играх \"Полоса препятствий\"! " +
                "Давайте посмотрим на участников:");

        getInfoAboutAllAnimal();

        //здесь будет начало цикла до условия победы
        while (existWin()) {



            //генерация вызова одного случайного метода



        }


        //здесь будет конец цикла

        getInfoAboutAllAnimal();

        run100MAllAnimal(); // бег 100 метров


    }

    public static void getInfoAboutAllAnimal() {

        cat.getInfo();
        fish.getInfo();
        horse.getInfo();
        human.getInfo();
        parrot.getInfo();

        System.out.println();

    }

    public static void run100MAllAnimal() {

        cat.run100M();
        fish.run100M();
        horse.run100M();
        human.run100M();
        parrot.run100M();

        System.out.println();
    }

    public static boolean existWin() {

        if

    }

}
