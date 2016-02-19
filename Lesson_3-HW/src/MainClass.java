import com.sun.org.apache.xpath.internal.SourceTree;

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

    private static String textOfVictory;

    public static void main(String[] args) {



        double dNumberOfGame = (Math.random() * 100) + 1;
        int numberOfGame = (int) dNumberOfGame;

        System.out.println("Приветствуем всех на " + numberOfGame + " межвидовых играх \"Полоса препятствий\"! " +
                "Давайте посмотрим на участников:");

        getInfoAboutAllAnimal();

        //начало цикла до условия победы
        while ((textOfVictory = existWin()) == "Пока победителя нет, давайте помучаем участников еще раз!") {



            //генерация вызова одного случайного метода
            int randNumber = (int)(Math.random() * 2) + 1; // генерируем случайное целое цисло от 1 до 3 (по числу методов)

            switch (randNumber) {
                case 1: run100MAllAnimal(); // бег 100 метров
                    break;
                case 2: climbOnHillAllAnimal(); //взобраться на холм
                    break;
                case 3: swimARiverAllAnimal(); //переплыть реку
                    break;
            }

            System.out.println(textOfVictory);
            getInfoAboutAllAnimal(); // в конце итерации показываем состояние участников



        } //конец цикла


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
        System.out.println("В этот раз всем участникам нужно пробежать 100 метров!");
        cat.run100M();
        fish.run100M();
        horse.run100M();
        human.run100M();
        parrot.run100M();

        System.out.println();
    }

    public static void climbOnHillAllAnimal() {
        System.out.println("В этот раз всем учатникам нужно взобраться на холм!");
        cat.climbOnHill();
        fish.climbOnHill();
        horse.climbOnHill();
        human.climbOnHill();
        parrot.climbOnHill();

        System.out.println();
    }

    public static void swimARiverAllAnimal() {

        System.out.println("В этот раз всем участникам нужно переплыть реку!");
        cat.swimARiver();
        fish.swimARiver();
        horse.swimARiver();
        human.swimARiver();
        parrot.swimARiver();

        System.out.println();
    }


    public static String existWin() {

        if (!cat.staminaIs0() && fish.staminaIs0() && horse.staminaIs0() && human.staminaIs0() && parrot.staminaIs0()  ) {
            //кот победил
            return "Кот победил!";
        }
        else if (cat.staminaIs0() && !fish.staminaIs0() && horse.staminaIs0() && human.staminaIs0() && parrot.staminaIs0()  ) {
            //Рыба победила
            return "Рыба победила!";
        }
        else if (cat.staminaIs0() && fish.staminaIs0() && !horse.staminaIs0() && human.staminaIs0() && parrot.staminaIs0()  ) {
            //Лошадь победила
            return "Лошадь победила!";
        }
        else if (cat.staminaIs0() && fish.staminaIs0() && horse.staminaIs0() && !human.staminaIs0() && parrot.staminaIs0()  ) {
            //Человек победил
            return "Человек победил!";
        }
        else if (cat.staminaIs0() && fish.staminaIs0() && horse.staminaIs0() && human.staminaIs0() && !parrot.staminaIs0()  ) {
            //Попугай победил
            return "Попугай победил!";
        }
        else {
            return "Пока победителя нет, давайте помучаем участников еще раз!";
        }
    }

}
