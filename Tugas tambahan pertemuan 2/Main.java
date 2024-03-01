//Nama : Abdul Majid
//NIM  : 24060122120035
//Lab : D1
public class Main {
    public static void main(String[] args) {
        /* Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
        Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);

        Student cahyo = new Student("Cahyo", 20, "456 Elm St", 723751);
        Student dani = new Student("Dani", 20, "123 Oak St", 734621);
        Student edi = new Student("Edi", 20, "789 Pine St", 733451);

        Course cs101 = new Course("CS101", "Intro to Computer Science", agus);
        Course cs102 = new Course("CS102", "Data Structures", agus);
        Course cs103 = new Course("CS103", "Algorithms", bambang);

        agus.teachCourse(cs101);
        agus.teachCourse(cs102);
        bambang.teachCourse(cs103);

        cs101.addStudent(cahyo);
        cs101.addStudent(dani);
        cs101.addStudent(edi);

        cs102.addStudent(cahyo);
        cs102.addStudent(dani);

        cs103.addStudent(cahyo);

          
        agus.viewTaughtCourses();
        cs101.viewEnrolledStudents();
        edi.viewEnrolledCourses(); */

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
