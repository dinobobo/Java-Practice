import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;
public class TripPlanner {
    public static void main(String[] args) {
        //greet();
        //udget();
        //Time();
        //CountryArea();
        Distance();
        //test();
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
        double MoneyPerday = (int) (money/(double) time * 100)/100.0;
        double localMoneyBudget = (int) (money*DollarConv * 100)/100.0;
        double localMoneyPerday = (int) (money*DollarConv/time * 100)/100.0;
        System.out.println("If you are travelling " + time + " days, that is the same as "
         + time*24 + " hours or " + time*24*60 + " minutes.");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $"
         + MoneyPerday + " USD");
        System.out.println("Your total budget in " + TripDst + " is " + localMoneyBudget
        + " " + TripDst + ", which per days is " + localMoneyPerday + TripDst);
        System.out.println("*****************************\n\n");
    }
    public static void Time(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference in hours, between your home and your destination?");
        int delay = input.nextInt();
        System.out.println("When it's midnight at home it will be " + (delay + 24)%24 + " :00 in your travel destination and when it's " +
                "noon at home it will be " + (delay + 12)%24 + ":00");
        System.out.println("*****************************\n\n");

    }
    public static void CountryArea(){
        Scanner input = new Scanner(System.in);
        System.out.print("What's the area of your destination country in km square?");
        double area = input.nextDouble();
        double KmToMile = 0.6214;
        double Mile2 = (int) (area * KmToMile * 100)/100.0;
        System.out.println("In mile square that is " + Mile2);
        System.out.println("*****************************\n\n");
    }
    public static void Distance(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the latitude and longitude of your home country? Seperate with space");
        Scanner Home = new Scanner(input.nextLine());
        System.out.print("What is the latitude and longitude of your destination country? Seperate with space");
        Scanner Des = new Scanner(input.nextLine());
        double LoHome = Home.nextDouble()/180*Math.PI;
        double LaHome = Home.nextDouble()/180*Math.PI;
        double LoDes = Des.nextDouble()/180*Math.PI;
        double LaDes = Des.nextDouble()/180*Math.PI;
        double EarthRadius = 6400.0;
        double Dis = 2*EarthRadius*Math.asin((Math.sqrt(Math.pow(Math.sin((LoDes - LoHome)/2),2) + Math.cos(LoHome)*Math.cos(LoDes)*Math.pow(Math.sin((LaDes - LaHome)/2),2))));
        System.out.println("The distance from your home to the destination is " + (int)(Dis*100)/100.0 + " km");
    }
    public static void test(){
        Scanner input = new Scanner(System.in);
        Scanner home = new Scanner(input.nextLine());
        System.out.println("Hello");
        Scanner des = new Scanner(input.nextLine());
        System.out.println(des.nextLine());
    }
}
