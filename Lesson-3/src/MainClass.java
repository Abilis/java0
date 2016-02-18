import java.util.ArrayList;

/**
 * Created by Abilis on 18.02.2016.
 */
public class MainClass {

    public static void main(String[] args) {

        ArrayList<String> str1 = new ArrayList<>();

        str1.add("hello");
        str1.add("world");

        System.out.println(str1);

        str1.add(0, "bye");
        System.out.println(str1);

        str1.set(0, "test");
        System.out.println(str1);

    }

}
