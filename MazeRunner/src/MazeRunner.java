import java.util.Scanner;
public class MazeRunner {
    public static Maze myMap = new Maze();
    public static void main(String [] args) {
        intro();
        while (!myMap.didIWin()) {
            String move = userMove();
            if (move.equals("R")) {
                if (myMap.canIMoveRight()) {
                    myMap.moveRight();
                    myMap.printMap();
                } else {
                    System.out.println("Sorry, you've hit a wall");
                    myMap.printMap();
                }
            }else if (move.equals("L")) {
                if (myMap.canIMoveLeft()) {
                    myMap.moveLeft();
                    myMap.printMap();
                } else {
                    System.out.println("Sorry, you've hit a wall");
                    myMap.printMap();
                }
            }else if (move.equals("U")) {
                if (myMap.canIMoveUp()) {
                    myMap.moveUp();
                    myMap.printMap();
                } else {
                    System.out.println("Sorry, you've hit a wall");
                    myMap.printMap();
                }
            }else{
                if (myMap.canIMoveDown()) {
                    myMap.moveDown();
                    myMap.printMap();
                } else {
                    System.out.println("Sorry, you've hit a wall");
                    myMap.printMap();
                }
            }
        }
    }
    public static void intro(){
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");
        myMap.printMap();
    }
    public static String userMove(){
        Scanner input = new Scanner(System.in);
        System.out.println("Where would you like to move? (R, L, U, D)");
        String move = input.next();
        if("RLUD".contains(move)){
            return move;
        }
        else{
            System.out.println("Pick among R, L, U, D");
            return userMove();
        }
    }
}
