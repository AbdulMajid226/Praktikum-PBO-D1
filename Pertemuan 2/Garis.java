//Nama : Abdul Majid
//NIM  : 24060122120035
//Lab : D1

public class Garis {
    // Atribut
    private Point tawal;
    private Point takhir;

    // Method
    // Konstruktor
    public Garis() {
        this.tawal = new Point();
        this.takhir = new Point();
    }

    public Garis(Point tawal, Point takhir) {
        this.tawal = new Point(tawal.getAbsis(), tawal.getOrdinat());
        this.takhir = new Point(takhir.getAbsis(), takhir.getOrdinat());
    }

    // Setter
    public void setTawal(double x, double y) {
        tawal.setAbsis(x);
        tawal.setOrdinat(y);
    }

    public void setTakhir(double x, double y) {
        takhir.setAbsis(x);
        takhir.setOrdinat(y);
    }

    // Getter
    public Point getTawal() {
        return tawal;
    }
    public Point getTakhir(){
        return takhir;
    }
    //print garis
    public void printGaris(Garis g){
        System.out.println("Garis:"+ "("+g.getTawal().getAbsis()+" , "+g.getTawal().getOrdinat()+")"+"("+g.getTakhir().getAbsis()+" , "+g.getTakhir().getOrdinat()+")");
    }

    //Operasi pada garis
    public double getPanjang(){
        double selisihX = takhir.getAbsis() - tawal.getAbsis();
        double selisihY = takhir.getOrdinat() - tawal.getOrdinat();
        return Math.sqrt(selisihX * selisihX + selisihY * selisihY);
    }
    public double getGradien(){
        double selisihX = takhir.getAbsis() - tawal.getAbsis();
        double selisihY = takhir.getOrdinat() - tawal.getOrdinat();

        // Menghindari pembagian oleh nol
        if (selisihX == 0) {
            return Double.POSITIVE_INFINITY; // Garis vertikal
        }

        return selisihY / selisihX;
    }
    public Garis getReflexiYGaris(){
        Point tawalRefleksi = tawal.getReflexiY();
        Point takhirRefleksi = takhir.getReflexiY();

        return new Garis(tawalRefleksi, takhirRefleksi);

    }
    public boolean isTegakLurus(Garis garisLain) {
        double gradien1 = this.getGradien();
        double gradien2 = garisLain.getGradien();
    
        // Dua garis tegak lurus jika hasil perkalian gradiennya adalah -1
        return gradien1 * gradien2 == -1;
    }
    
}
