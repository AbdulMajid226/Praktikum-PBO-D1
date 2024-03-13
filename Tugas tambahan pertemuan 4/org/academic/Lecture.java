package org.academic;
import org.person.Person;
import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    // Override method getDetails() dari superclass Person
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("  Employee ID: " + employeeID);
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(name + " is teaching course: " + course.getCourseName());
    }

    public void viewTaughtCourses() {
        System.out.println("----------------------");
        System.out.println("Courses taught by " + name + ":");
        System.out.println("----------------------");
        if (coursesTaught.isEmpty()) {
            System.out.println("  This lecturer hasn't taught any courses yet.");
        } else {
            for (Course course : coursesTaught) {
                course.getDetails();
                System.out.println("-----------");
            }
        }
    }
}

