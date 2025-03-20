import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find the first 
        result[0] = findBound(nums, target, true);

        // Find the last
        if (result[0] != -1) {
            result[1] = findBound(nums, target, false);
        }

        return result;
    }

    public static int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int bound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                bound = mid;
                if (isFirst) {
                    right = mid - 1;  // Continue searching on the left
                } else {
                    left = mid + 1;   // Continue searching on the right
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return bound;
    }
}
