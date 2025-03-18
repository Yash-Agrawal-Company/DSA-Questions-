import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};
        int temp;
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
