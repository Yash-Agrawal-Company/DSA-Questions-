import java.util.ArrayList;

public class VowelsStrings {
    public static void main(String[] args) {
        String words[] = {"are","amy","u"};
        int left = 0 , right = 2;
        ArrayList <Character> vowels = new ArrayList<>();
        vowels.add('a');
       vowels.add('e');
       vowels.add('i');
       vowels.add('o');
       vowels.add('u');
       int count = 0;
       for(int i = left ; i <= right ; i++){
        if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1))){
            count++;
        }
       }
        System.out.println(count);
       
    }
}
