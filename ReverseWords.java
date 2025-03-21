
public class ReverseWords {
    public static void main(String[] args) {
        String s = "a good   example";
        s = s.trim();
        String words[] = s.split(" ");
        StringBuffer result = new StringBuffer();
        for(int i = words.length - 1 ; i >= 0 ; i--){
            if(words[i].length() < 1){
                continue;
            }
            result.append(words[i]);
            if (i > 0)  {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}
