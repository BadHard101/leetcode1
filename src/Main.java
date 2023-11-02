import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Indexes: " + Arrays.toString(twoSum(new int[]{3,2,3}, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] temp = {-1, -1};
        int[] ans = {-1, -1};

        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        for (int i = 0; i < copy.length; i++) {
            int elem = Arrays.binarySearch(copy, target - copy[i]);
            if (elem >= 0)
                temp[0] = copy[Arrays.binarySearch(copy, target - copy[i])];
            if (temp[0] != -1) {
                temp[1] = copy[i];
                break;
            }
        }
        System.out.println("Sum of: " + Arrays.toString(temp));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp[0] || nums[i] == temp[1]) {
                if (ans[0] != -1) {
                    ans[1] = i;
                    return ans;
                } else ans[0] = i;
            }
        }

        return ans;
    }
}