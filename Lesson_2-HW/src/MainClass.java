/**
 * Created by Abilis on 14.02.2016.
 */
public class MainClass {

    public static void main(String[] args) {

        //Проверка, работает ли класс
        Empl empl1 = new Empl("Иван", "Иванов", "Иванович", "офисный планктон", "vpupkin@mail.net",
                "8 999 17 18 19", "1 000 001", 38);


        empl1.getInfoOfEmpl();
        System.out.println("Возраст: " + empl1.getAge());
        System.out.println("Зарплата: " + empl1.getSalary());
        empl1.setFirstName("Петр");
        empl1.getInfoOfEmpl();

        //Вроде работает

        //5 задание. Нужно создать массив из 10 сотрудников
        Empl[] emplArr = new Empl[10];

        emplArr[0] = new Empl("Петр", "Петров", "Иванович", "золотарь", "vpupkin1@mail.net",
                "8 999 17 18 01", "55 000", 45);
        emplArr[1] = new Empl("Владлен", "Ульянов", "Иванович", "золотарь", "vpupkin2@mail.net",
                "8 999 17 18 02", "54 000", 58);
        emplArr[2] = new Empl("Клементий", "Васин", "Иванович", "мастер-ломастер", "vpupkin3@mail.net",
                "8 999 17 18 03", "52 000", 72);
        emplArr[3] = new Empl("Акакий", "Петров", "Акакиевич", "заплечных дел мастер", "vpupkin4@mail.net",
                "8 999 17 18 04", "51 000", 25);
        emplArr[4] = new Empl("Паратрупер", "Сидоров", "Иванович", "бунтарь", "vpupkin5@mail.net",
                "8 999 17 18 05", "50 000", 41);
        emplArr[5] = new Empl("Кана", "Полищук", "Иванович", "революционер", "vpupkin6@mail.net",
                "8 999 17 18 06", "49 000", 32);
        emplArr[6] = new Empl("Гомер", "Маршал", "Иванович", "овощ", "vpupkin7@mail.net",
                "8 999 17 18 07", "48 000", 37);
        emplArr[7] = new Empl("Фрай", "Колдун", "Иванович", "тот еще фрукт", "vpupkin8@mail.net",
                "8 999 17 18 08", "47 000", 46);
        emplArr[8] = new Empl("Ветер", "Обломов", "Иванович", "канатоходец", "vpupkin9@mail.net",
                "8 999 17 18 09", "46 000", 63);
        emplArr[9] = new Empl("Стокер", "Вересков", "Иванович", "веселый молочник", "vpupkin10@mail.net",
                "8 999 17 18 10", "45 000", 39);


        //6. Теперь нужно с помощью цикла вывести информацию о сотрудниках, старше 40 лет
        System.out.println();
        System.out.println("Данные по сотрудникам, старше 40 лет:");
        for (int i = 0; i < emplArr.length; i++) {
            if (emplArr[i].getAge() > 40) {
                emplArr[i].getInfoOfEmpl();
            }

        }
        //ура, получилось без гугла!

        //7. В сеттере возраста прописать возможные значения от 18 до 70 лет
        System.out.println("Возраст первого тестового сотрудника: " + empl1.getAge());
        empl1.setAge(69);
        System.out.println("Возраст первого тестового сотрудника: " + empl1.getAge());
        empl1.setAge(70);
        System.out.println("Возраст первого тестового сотрудника: " + empl1.getAge());
        empl1.setAge(18);
        System.out.println("Возраст первого тестового сотрудника: " + empl1.getAge());
        empl1.setAge(71);
        System.out.println("Возраст первого тестового сотрудника: " + empl1.getAge());

    }


}
