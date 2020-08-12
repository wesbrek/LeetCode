import java.util.Arrays;

public class UI {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int [] nums = {2, 5, 7, 10, 11};
        int target = 9;

        int [] twoNumbers = solution.twoSum(nums, target);

        System.out.println(Arrays.toString(twoNumbers));
    }
}
