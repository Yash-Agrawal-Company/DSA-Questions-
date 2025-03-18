public class ArraySorted {
    public static void main(String[] args) {
       int nums[] = {10, 20, 30, 40, 50};
       boolean isSorted = true;
       for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] > nums[i + 1]) {
            isSorted = false;
            break;
        }
       }
       System.out.println("Is the array sorted : "+isSorted);
    }
}
