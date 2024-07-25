import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int[] ans = new int[2];
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(target - nums[i], i);
        }
        return new int[2];
    }
}