//Nama : Abdul Majid
//NIM  : 24060122120035
//Lab : D1
import java.util.List;
import java.util.ArrayList;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    //Konstruktor
    public Lecture(String name, int age, String address, int employeeID) {
        this.coursesTaught = new ArrayList<>();
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
    }
    //Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void getDetails() {
        System.out.println("  Name: " + name);
        System.out.println("  Age: " + age);
        System.out.println("  Address: " + address);
        System.out.println("  Employee ID: " + employeeID);
    }    

    public void teachCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(name + " mengajar kelas: " + course.getCourseName());
    }

    public void viewTaughtCourses() {
        System.out.println("----------------------");
        System.out.println("Kelas yang diampu oleh " + name);
        System.out.println("----------------------");
        
        if (coursesTaught.isEmpty()) {
            System.out.println("Dosen ini belum mengampu kelas apapun.");
        } else {
            for (Course course : coursesTaught){
                course.getDetails();// Memanggil metode getDetails dari kelas Course
                System.out.println("-----------");
            }
        }
    }

    
}
