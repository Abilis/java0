/**
 * Created by Abilis on 13.02.2016.
 */
public class MainClass {

    public static void main(String[] args) {

        int arr[] = new int[10]; //Создаем пустой массив с 10 элементами

        for (int i = 0; i < arr.length; i++) { //Заполняем массив натуральными числами
            arr[i] = i + 1;
        }

        DrawArr(arr); //рисуем исходный массив

        //Переворачиваем массив
        for (int i = 0; i < arr.length / 2; i++) {
            int start_el = arr[i]; //элемент из начала массива к середине
            int finish_el = arr[arr.length - i - 1]; //элемент из конца массива к середине
            arr[i] = finish_el;                 //меняем значения
            arr[arr.length - i - 1] = start_el; //местами
        }


        DrawArr(arr); //рисуем уже перевернутый массив


    }

    public static void DrawArr(int arr[]) {

        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}