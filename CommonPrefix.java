import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        StringBuffer result = new StringBuffer();
        for(int i = 0 ; i < Math.min(first.length(), last.length()) ; i++){
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            result.append(first.charAt(i));
        }
        System.out.println(result.toString());
    }
}
