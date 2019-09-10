import java.util.Scanner;
public class Crypto {
    public static void main(String[] args){
        //Scanner input = new Scanner(System.in);
        //System.out.println("What is the text you want to normalize?");
        //String text = input.nextLine();
        //String NormalizedText = normalizeText(text);
        //System.out.println("The normalized text is " + NormalizedText);
        //String encryptedText = caesarify(NormalizedText, 10);
        //System.out.println("The Encrypted Text is " + encryptedText );
        System.out.println(groupify("adfagwesadg", 3));
    }
    public static String normalizeText(String text){
        String TextNoSpace = text.replaceAll("\\s", "");
        String ansText = TextNoSpace.replaceAll("\\p{Punct}", "");
        return ansText.toUpperCase();
    }
    public static String caesarify(String s, int shift){
        String alphabet = shiftAlphabet(0);
        String shiftedAlphabet = shiftAlphabet(shift);
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            ans += shiftedAlphabet.charAt(alphabet.indexOf(s.charAt(i)));
        }
        return ans;}
    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
    public static String groupify(String s, int num){
        String ans = "";
        int i = num;
        while(i < s.length()){
            ans += s.substring(i-num, i);
            ans += " ";
            i += num;
        }
        ans += s.substring(i - num);
        ans += "x".repeat(i - s.length());
        return ans;
    }
}
