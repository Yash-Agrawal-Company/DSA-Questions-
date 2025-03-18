import java.util.Arrays;
public class MinMax{
    public static int[] findMinMax(int nums[]){
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for(int i : nums){
            if(i > max) max = i;
            if(i < min) min = i;
        }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,8,10,13,-2,9};
        System.out.println(Arrays.toString(findMinMax(nums)));
    }
}