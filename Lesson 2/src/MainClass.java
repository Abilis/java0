/**
 * Created by Abilis on 13.02.2016.
 */
public class MainClass {

    static char[][] field = new char[3][3];

    public static void main(String[] args) {

        initField();
        printField();
        setXO(1, 1, 'X');
        printField();




    }


    public static void initField() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = '*';
            }

        }

    }

    public static void printField() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();


    }

    public static void setXO(int _x, int _y, char _xo) {

        field[_y][_x] =_xo;

    }

    public static void playerTurn() {

        System.out.println("Введите координаты в формате x, y");


    }


}
