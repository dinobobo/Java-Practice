public class Calculus {
    public static void Calculus(){
        System.out.printf("Welcome to Math World");
    }
    public static int add(int x, int y){
        return x + y ;
    }
    public static int square(int x){
        return x*x;
    }
    public static void main(String[] args){
        Calculus();
        for (int i = 1; i<=10; i++){
            System.out.println("The square of " + i + " is " + square(i));
        }
    }
}
