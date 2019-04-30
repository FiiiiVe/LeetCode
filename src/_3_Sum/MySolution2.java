package _3_Sum;

import java.util.*;

public class MySolution2 {
    public static void main(String[] args) {
        List<List<Integer>> a = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(a.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int k = 0; k < nums.length; k++) {
            if (k > 0 && nums[k] == nums[k-1]) continue;
            int i = 0, j = nums.length - 1;
            while (i < j) {
                if (i == k) {
                    i++;
                    continue;
                }
                if (j == k) {
                    j--;
                    continue;
                }
                int sum = nums[k] + nums[i] + nums[j];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    break;
                } else if (sum > 0) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return result;
    }
}
