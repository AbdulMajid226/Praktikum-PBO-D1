package org.main;

import org.academic.*;


public class mainAcademic {
    public static void main(String[] args) {
        Lecture jokowi = new Lecture("Jokowi", 60,"jakarta",99764 );
        Lecture prabowo = new Lecture("Prabowo", 71, "jakarta", 98789);
        
        Student gibran = new Student("Gibran", 38, "Solo", 87767);
        Student imin = new Student("Imin", 50, "Jakarta", 98678);
        Student mahfud = new Student("Mahfud", 59, "Bekasi", 32535);
        
        Course pbo = new Course("PAIK23", "Pemrograman Berbasis Objek", jokowi);
        Course asa = new Course("PAIK26", "Analisis Strategi Algoritma", prabowo);
        Course mep = new Course("PAIK30", "Masyarakat dan Etika Profesi", jokowi);

        jokowi.teachCourse(mep);
        jokowi.teachCourse(pbo);
        prabowo.teachCourse(asa);
        System.out.println();
        pbo.addStudent(gibran);
        pbo.addStudent(imin);
        pbo.addStudent(mahfud);

        asa.addStudent(gibran);
        asa.addStudent(imin);
    
        mep.addStudent(gibran);
        System.out.println();
        gibran.enrollInCourse(pbo);
        gibran.enrollInCourse(asa);
        gibran.enrollInCourse(mep);

        imin.enrollInCourse(pbo);
        imin.enrollInCourse(asa);

        mahfud.enrollInCourse(pbo);
        System.out.println();

        gibran.viewEnrolledCourses();
        jokowi.viewTaughtCourses();
        pbo.viewEnrolledStudents();
    }
}
