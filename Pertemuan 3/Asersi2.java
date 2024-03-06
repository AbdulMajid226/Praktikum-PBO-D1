//Nama : Abdul Majid
//NIM : 24060122120035

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = -1;
        assert(jariJari>0): "jari-jari tidak boleh nol atau negatif"; 
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}
//harusnya pesan errornya  "jari jari tidak boleh nol atau negatif" karena panjang jari jari juga tidak boleh negatif