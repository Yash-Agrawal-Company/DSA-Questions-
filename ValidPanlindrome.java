public class ValidPanlindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String output;
        s = s.toLowerCase();
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                bf.append(s.charAt(i));
            }
        }

        StringBuffer org = bf;
        StringBuffer reversed = new StringBuffer(bf).reverse();
        output = org.toString().equals(reversed.toString()) ?  "Valid palindrome" : "Invalid palindrome";
        System.out.println(output);
    }
}
