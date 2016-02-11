/**
 * Created by Abilis on 11.02.2016.
 */
public class MainClass {

    public static void main(String[] args) {

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10 + i;
        }

        for (int n : nums) {
            System.out.print(n + " ");
        }

    }

}
