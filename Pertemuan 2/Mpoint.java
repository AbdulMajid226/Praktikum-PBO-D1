//Nama : Abdul Majid
//NIM  : 24060122120035
//Lab : D1

public class Mpoint {
    public static void main(String args[]) {
        Point t1 = new Point();
        Point t2 = new Point();
        Point t3 = new Point();

        t1.setAbsis(3);
        t1.setOrdinat(4);

        System.out.println("Titik Awal(" + t1.getAbsis() + ","+t1.getOrdinat() + ")");
        
        System.out.println("get Jarak dari pusat = " + t1.getJarakPusat());

        t1.reflexiX();
        System.out.println("ReflexiX(" + t1.getAbsis() + ","+t1.getOrdinat() + ")");
        
        t1.reflexiY();
        System.out.println("ReflexiY(" + t1.getAbsis() + ","+t1.getOrdinat() + ")");

        //Set ulang t1
        t1.setAbsis(3);
        t1.setOrdinat(4);

        t2 = t1.getRefleksiX();
        System.out.println("GetReflexiX(" + t2.getAbsis() + ","+t2.getOrdinat() + ")");

        t3 = t1.getReflexiY();
        System.out.println("GetReflexiX(" + t3.getAbsis() + ","+t3.getOrdinat() + ")");

}
}
