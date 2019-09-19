package ui;
import model.Transcript;
public class Main {
    public static void main(String[] args) {
        Transcript t1 = new Transcript("Hachi", 1010);
        Transcript t2 = new Transcript("DinoBob", 1234);

        t1.addGrade("Obedience1", 3.8);
        t1.addGrade("Obedience2", 4.0);

        System.out.println(t1.getStudentName() + ": ");
        t1.printTranscript();;
    }
}
