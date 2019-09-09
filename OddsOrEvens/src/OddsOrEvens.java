import java.util.Scanner;
import java.util.Random;
public class OddsOrEvens {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hi " + name + ", which do you pick, (O)dd or (E)ven?");
        Boolean CorrectPick = false;
        String pick = input.next();
        while(CorrectPick ==  false){
            if (pick.equalsIgnoreCase("O")) {
                System.out.println(name + " has picked odds! The bot will be evens");
                CorrectPick = true;
            } else if (pick.equalsIgnoreCase("E")) {
                System.out.println(name + " has picked evens! The bot will be odds");
                CorrectPick = true;
            } else {
                System.out.println("Wrong input, please input O for odds or E for evens. Please input again");
                pick = input.next();
            }
        }
        System.out.println("------------------------------------------");


        System.out.println("How many \"fingers\" do you put out?");
        int HumanInput = input.nextInt();
        Random rand = new Random();
        int PCInput = rand.nextInt(6);
        System.out.println("The computer played " + PCInput + " \"fingers\".");
        System.out.println("------------------------------------------");
        String ans;
        if((HumanInput + PCInput)%2 == 0){
            ans = "E";
        }else{
            ans = "O";
        }
        System.out.println(HumanInput + " + " + PCInput + " = " + " " + (HumanInput + PCInput) );
        if(ans.equals("E")) {
            System.out.println(HumanInput + PCInput + " is " + "...even!");
        }else{
            System.out.println(HumanInput + PCInput + " is " + "...odd!");
        }
        if(ans.equals(pick)) {
            System.out.println("That means " + name + " wins! :)");
        }else{
            System.out.println("That means PC wins! :(");
        }

    }
}
