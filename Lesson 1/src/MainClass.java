/**
 * Created by Abilis on 10.02.2016.
 */
public class MainClass {

    public static void main(String[] args) {

        int[] testarr = new int[79];

        for (int i = 0; i < testarr.length; i++) {
            testarr[i] = (int)(Math.random() * 101); // гереним случайное целое число от 0 до 100
        }

        int max = 100; //максимальное и минимальное значения в массиве
        int min = 0;

        printArr(testarr); //рисуем массив на экране

        int minFromArr = getMinFromArr(testarr, max); //Получаем минимальное значение в массиве
        int maxFromArr = getMaxFromArr(testarr, min); //Получаем максимальное значение в массиве
        int averFromArr = getAverageFromArr(testarr); //Получаем среднее значение в массиве

        System.out.println("Минимальное значение в массиве: " + minFromArr);
        System.out.println("Максимальное значение в массиве: " + maxFromArr);
        System.out.println("Среднее значение в массиве " + averFromArr);

        

    }

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (((i % 50) == 0) && (i != 0)) {
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    
    public static int getMinFromArr(int arr[], int max) {

        for (int i: arr) {
            if (i < max) {
                max = i;
            }
        }

        return max;
    }

    public static int getMaxFromArr(int arr[], int min) {

        for (int i: arr) {
            if (i > min) {
                min = i;
            }
        }

        return min;

    }

    public static int getAverageFromArr(int arr[]) {

        int sumOfArr = 0;
        for (int i: arr) {
             sumOfArr += i;
        }

        int averOfArr = sumOfArr / arr.length;

        return averOfArr;

    }


}
