public class MedirumBinarySearch {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 14;
        int left = 0 , right  = nums.length - 1 , mid = 0 , index = -1;
        while(left <= right){
            mid = (left+right)/2;
            if(nums[mid] == target){
                index = mid;
                break;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(index);
    }
}
