import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int nums[] = {5, 2, 3, 1};
        
        // Applying Quick Sort
        quickSort(nums, 0, nums.length - 1);
        
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int nums[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(nums, low, high);
            
            quickSort(nums, low, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, high);
        }
    }

    public static int partition(int nums[], int low, int high) {
        int pivot = nums[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {   
            // Preventing out-of-bounds access
            while (i <= high && nums[i] <= pivot) {
                i++;
            }
            
            while (j >= low && nums[j] > pivot) {
                j--;
            }

            if (i < j) {
                // Swap elements at i and j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Swap pivot with the correct position
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;  // Return pivot index
    }
}
