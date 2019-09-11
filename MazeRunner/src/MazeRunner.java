import java.util.Scanner;
public class MazeRunner {
    static Maze myMap = new Maze();
    static int steps = 0;
    static String move;
    public static void main(String [] args) {
        intro();
        myMap.printMap();
        while (!myMap.didIWin()) {
            move = userMove();
            steps ++;
            if(myMap.isThereAPit(move)){
                navigatePit();
                continue;
            }
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
                }
            }else if (move.equals("U")) {
                if (myMap.canIMoveUp()) {
                    myMap.moveUp();
                    myMap.printMap();
                } else {
                    System.out.println("Sorry, you've hit a wall");
                }
            }else{
                if (myMap.canIMoveDown()) {
                    myMap.moveDown();
                    myMap.printMap();
                } else {
                    System.out.println("Sorry, you've hit a wall");
                }
            }
            if(steps <= 100){
                movesMessage(steps);
            }else{
                System.out.println("Sorry, but you didn't escape in time- you lose!");
                break;
            }
        }
        if(myMap.didIWin()){
            System.out.println("Congratulations! You made it out alive!");
            System.out.println("You did it in " + steps + " moves!");
        }

    }
    public static void intro(){
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position:");

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

    public static void movesMessage(int steps){
        if(steps == 50){
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        }else if(steps == 75){
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        }else if(steps == 90){
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        }else if(steps == 100){
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER >:[");
        }
    }

    public static void navigatePit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Watch out! There is a pit! Jump it?");
        String ans = input.next();
        if(ans.charAt(0) == 'y'){
            myMap.jumpOverPit(move);
        }else{

        }
    }
}
