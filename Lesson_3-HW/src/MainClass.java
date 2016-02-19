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

    public static void main(String[] args) {

        double dNumberOfGame = (Math.random() * 100) + 1;
        int numberOfGame = (int) dNumberOfGame;

        System.out.println("Приветствуем всех на " + numberOfGame + " межвидовых играх \"Полоса препятствий\"! " +
                "Давайте посмотрим на участников:");

        getInfoAboutAllAnimal();

        try {
            Thread.sleep(4000); //Задержка в 4 секунды чтобы посмотреть, что сейчас будет
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println();
        System.out.println("Сейчас мы начнем игры! Правила просты: мы будем заставлять участников что-то делать, " +
        "пока они один за другим не свалятся от усталости.");
        System.out.println("Останется только один - он и будет победителем! А, возможно, с дистанции сойдут все!");

        try {
            Thread.sleep(7000); //Задержка в 7 секунд чтобы посмотреть, что сейчас будет
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println();

        //начало цикла до условия победы
        while (existWin() == 0) {

            //генерация вызова одного случайного метода
            int randNumber = (int) (Math.random() * 6) + 1; // генерируем случайное целое цисло от 1 до 6 (по числу методов)

            switch (randNumber) {
                case 1:
                    run100MAllAnimal(); // бег 100 метров
                    break;
                case 2:
                    climbOnHillAllAnimal(); //взобраться на холм
                    break;
                case 3:
                    swimARiverAllAnimal(); //переплыть реку
                    break;
                case 4:
                    makeASoundAllAnimal(); //издать звук
                    break;
                case 5:
                    stopBeAsAParrotAllAnimal(); //перестать попугайничать
                    break;
                case 6:
                    showAnimalDocsAllAnimal(); //показать документ животного
                    break;


            }


            getInfoAboutAllAnimal(); // в конце итерации показываем состояние участников


            switch (existWin()) {

                case 1:
                    System.out.println("Победил " + cat.specie + " " + cat.name + "!");
                    break;
                case 2:
                    System.out.println("Победила " + fish.specie + " " + fish.name + "!");
                    break;
                case 3:
                    System.out.println("Победила " + horse.specie + " " + horse.name + "!");
                    break;
                case 4:
                    System.out.println("Победил " + human.specie + " " + human.name + "!");
                    break;
                case 5:
                    System.out.println("Победил " + parrot.specie + " " + parrot.name + "!");
                    break;
                case 10:
                    System.out.println("Все проиграли! На " + numberOfGame + " межвидовых играх" +
                                        " \"Полоса препятствий\" нет победителя!");
                    break;

            }

            try {
                Thread.sleep(2000); //Задержка в 2 секунды в конце каждого цикла, чтобы можно было наблюдать прогресс
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
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

    public static void makeASoundAllAnimal() {

        System.out.println("В этот раз всем участникам нужно что-нибудь прокричать!");
        cat.makeASound();
        fish.makeASound();
        horse.makeASound();
        human.makeASound();
        parrot.makeASound();

        System.out.println();
    }

    public static void stopBeAsAParrotAllAnimal() {

        System.out.println("В этот раз всем участникам нужно перестать попугайничать!");
        cat.stopBeAsAParrot();
        fish.stopBeAsAParrot();
        horse.stopBeAsAParrot();
        human.stopBeAsAParrot();
        parrot.stopBeAsAParrot();

        System.out.println();
    }

    public static void showAnimalDocsAllAnimal() {

        System.out.println("В этот раз всем участникам нужно показать удостоверение животного!");
        cat.showAnimalDocs();
        fish.showAnimalDocs();
        horse.showAnimalDocs();
        human.showAnimalDocs();
        parrot.showAnimalDocs();

        System.out.println();
    }


    public static int existWin() {

        if (!cat.staminaIs0() && fish.staminaIs0() && horse.staminaIs0() && human.staminaIs0()
                && parrot.staminaIs0()) {
            return 1;
        }

        else if (cat.staminaIs0() && !fish.staminaIs0() && horse.staminaIs0() && human.staminaIs0()
                && parrot.staminaIs0()) {
            return 2;
        }

        else if (cat.staminaIs0() && fish.staminaIs0() && !horse.staminaIs0() && human.staminaIs0()
                && parrot.staminaIs0()) {
            return 3;
        }

        else if (cat.staminaIs0() && fish.staminaIs0() && horse.staminaIs0() && !human.staminaIs0()
                && parrot.staminaIs0()) {
            return 4;
        }

        else if (cat.staminaIs0() && fish.staminaIs0() && horse.staminaIs0() && human.staminaIs0()
                && !parrot.staminaIs0()) {
            return 5;
        }

        else if (cat.staminaIs0() && fish.staminaIs0() && horse.staminaIs0() && human.staminaIs0()
                && parrot.staminaIs0()) {
            return 10; //все проиграли
        }

        else {
            return 0;
        }

    }




}
