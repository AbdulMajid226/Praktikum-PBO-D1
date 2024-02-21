public class MTitik{
    public static void main (String args[]){
        Titik t2 = new Titik();
        Titik t1 = new Titik();
        t2.setAbsis (1);
        t1.setAbsis (4);
        t2.setOrdinat(7);
        t1.setOrdinat(7);

        System.out.println("t1(" + t1.getAbsis() + ","+t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ","+t2.getOrdinat() + ")");
        
        Titik t3 = new Titik(5,6);
        System.out.println("t3(" + t3.getAbsis() + ","+t3.getOrdinat() + ")");
        System.out.println("Jumlah Objek Titik : " + t3.getCounter());


    }    

}
