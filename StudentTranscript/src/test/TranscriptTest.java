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
    public void setUp(){
        testTranscript = new Transcript("Hachi", 1234);
    }
    @Test
    public void testaddGrade(){
        String testCourse = "DoggoClass";
        double testGrade = 100.0;
        testTranscript.addGrade(testCourse, testGrade);
        assertTrue(testTranscript.getCourseGrade(testCourse) == testGrade);
    }

}
