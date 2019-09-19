package model;

import java.util.ArrayList;
import java.util.List;

public class Transcript {
    //MODIFIES: this
    //EFFECTS: Give the course grade
    private String studentName;
    private int studentID;
    private List<Double> grades;
    private List<String> courses;

    public Transcript(String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;
        this.grades = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    public void addGrade(String course, double grade){
        this.grades.add(grade);
        this.courses.add(course);
    }
    //REQUIRES: a course the student has already taken.
    //MODIFIES: this
    //EFFECTS: Get course name and it's grade in a string format
    public String getCourseAndGrade(String course){
        int courseIndex = this.courses.indexOf(course);
        return course + ": " + Double.toString(this.grades.get(courseIndex));
    }

    //MODIFIES: this
    //EFFECTS: Print out the transcript
    public void printTranscript(){
        System.out.print(this.studentName + "  ");
        for(String course: this.courses){
            System.out.print(this.getCourseAndGrade(course) + ",  ");
        }
        System.out.println("\nGPA: " + this.getGPA());
    }

    public double getCourseGrade(String course){
        return this.grades.get(this.courses.indexOf(course));
    }

    //MODIFIES: this
    //EFFECTS: calculates GPA
    public double getGPA(){
        double sum = 0;
        for(double d:this.grades) sum += d;
        return sum/this.grades.size();

    }

    public String getStudentName(){
        return this.studentName;
    }
}
