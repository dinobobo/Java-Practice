import java.util.Scanner;
public class Crypto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What string you want to encrypt?");
        String s = input.nextLine();
        System.out.println("How much you want to shift and what is the group size?");
        String size = input.nextLine();
        Scanner sizeScanner = new Scanner(size);
        int shift = sizeScanner.nextInt();
        int groupSize = sizeScanner.nextInt();
        String result = encryptString(s, shift, groupSize);
        System.out.println("Your encrypted string is " + result);
        String DecryptResult = decryptString(result,shift);
        System.out.println("Your decrypted result is " + DecryptResult);


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
    public static String encryptString(String s, int shift, int groupSize){
        String NormalizedText = normalizeText(s);
        String encryptedText = caesarify(NormalizedText, shift);
        return groupify(encryptedText, groupSize);
    }
    public static String ungroupify(String s){
        String sNoSpace =  s.replaceAll("\\s","");
        int xIndex = sNoSpace.indexOf('x');
        if(xIndex == -1){
            return sNoSpace;
        }else{
            return sNoSpace.substring(0,xIndex);
        }

    }
    public static String decryptString(String s, int shift){
        String normalizedS = ungroupify(s);
        return caesarify(normalizedS, -shift);
    }
}
