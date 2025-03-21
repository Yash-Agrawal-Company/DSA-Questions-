public class HomogeneousSubStrings {
    public static void main(String[] args) {
        String str = "abbcccaa";
        int count = 1, currLength = 1;
        for(int i = 1;i < str.length();i++){
            if (str.charAt(i) == str.charAt(i-1)) {
                currLength++;
            }else{
                currLength = 1;
            }
            count = (count + currLength) % 1000000007;
        }
        System.out.println(count);
    }
}
 