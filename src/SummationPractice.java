import java.util.ArrayList;
import java.util.Collections;

public class SummationPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 6, 3, 7, 23, 18, 41, 88);

        int sum = sum(nums);
        System.out.println(nums + "  --SUM-->  " + sum);


    }

    public static int sum(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }
}
