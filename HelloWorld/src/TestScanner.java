import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args){
        Scanner NewInput = new Scanner(System.in);
        System.out.println("What is your dog's name");
        String DoggoName = NewInput.next();
        System.out.println("My dog's name is : " + DoggoName);
    }
}
