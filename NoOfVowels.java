import java.util.ArrayList;

public class NoOfVowels {
    public static void main(String[] args) {
        int count = 0;
        ArrayList <Character> vowels = new ArrayList<>();
        String s = "gLa University";
        s = s.toLowerCase();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
