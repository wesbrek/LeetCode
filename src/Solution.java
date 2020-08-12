public class Solution {

    public int[] twoSum(int [] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {nums[i],nums[j]};
                }
            }
        }
        throw new IllegalArgumentException("No two num solution");
    }


    //My first solution
    public int[] OldtwoSum(int [] nums, int target) {
        int[] twoSum = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < target && i != j) {
                    if (nums[i] + nums[j] == target) {
                        twoSum[0] = nums[i];
                        twoSum[1] = nums[j];
                        return twoSum;
                    }
                }
            }
        }
        return twoSum;
    }
}
