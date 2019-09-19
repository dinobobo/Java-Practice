package test;

import org.junit.Before;
import org.junit.Test;
import model.Transcript;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TranscriptTest {
    private Transcript testTranscript;

    @Before
    public void setUp() {
        testTranscript = new Transcript("Hachi", 1234);
    }

    @Test
    public void testaddGrade() {
        String testCourse = "DoggoClass";
        double testGrade = 100.0;
        testTranscript.addGrade(testCourse, testGrade);
        assertTrue(testTranscript.getCourseGrade(testCourse) == testGrade);
    }

    @Test
    public void testGetGPA(){
        String testCourse1 = "Dog1";
        String testCourse2 = "Dog2";
        double testGrade1 = 100;
        double testGrade2 = 50;
        testTranscript.addGrade(testCourse1, testGrade1);
        testTranscript.addGrade(testCourse2, testGrade2);
        assertTrue(testTranscript.getGPA() == 75.0);
        testTranscript.printTranscript();

    }

}
