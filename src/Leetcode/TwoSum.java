package Leetcode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    newArr[0] = j;
                    newArr[1] = i;
                }
            }
        }
        return newArr;
    }
}
