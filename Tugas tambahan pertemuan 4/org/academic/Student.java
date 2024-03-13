package org.academic;
import org.person.Person;
import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    // Override method getDetails() dari superclass Person
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("  Student ID: " + studentID);
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
        System.out.println(name + " enrolled in course: " + course.getCourseName());
    }

    public void viewEnrolledCourses() {
        System.out.println("----------------------");
        System.out.println("Courses enrolled by " + name + ":");
        System.out.println("----------------------");
        if (coursesEnrolled.isEmpty()) {
            System.out.println("  This student hasn't enrolled in any courses yet.");
        } else {
            for (Course course : coursesEnrolled) {
                course.getDetails();
                System.out.println("-----------");
            }
        }
    }
}

