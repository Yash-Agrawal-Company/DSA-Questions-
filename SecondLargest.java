public class SecondLargest {
    public static void main(String[] args) {
        int nums[] = {10, 10, 10};
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if (num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
        secondLargest = (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
        System.out.println(secondLargest);
        System.out.println(largest);
    }
}
