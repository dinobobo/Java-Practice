import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args){
        greet();
        Budget();
    }
    public static void greet(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Trip Planner!");
        System.out.print("What is your name?");
        String name = input.next();
        System.out.print("Hello " + name + ", where are you travelling to?");
        String place = input.next();
        System.out.println(place + " sounds like a wonderful place!");
        System.out.println("*****************************\n\n");
    }
    public static void Budget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to stay?");
        int time = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend?");
        int money = input.nextInt();
        System.out.print("What is the currency symbol for your trip destination?");
        String TripDst = input.next();
        System.out.print("How many " + TripDst + " are there in 1 USD?");
        double DollarConv = input.nextDouble();


        System.out.println("If you are travelling " + time + " days, that is the same as "
         + time*24 + " hours or " + time*24*60 + " minutes.");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $"
         + money/(double) time + " USD");
        System.out.println("Your total budget in " + TripDst + " is " + money*(double) DollarConv
        + " " + TripDst + ", which per days is " + money*DollarConv/time + TripDst);
        System.out.println("*****************************\n\n");
    }
    public static void Time(){
        Scanner input = new Scanner(System.in);
    }
    public static void CountryArea(){
        Scanner input = new Scanner(System.in);
    }
    public static void Distance(){
        Scanner input = new Scanner(System.in);
    }
}
