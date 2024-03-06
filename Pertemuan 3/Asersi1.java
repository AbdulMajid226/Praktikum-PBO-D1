//Nama : Abdul Majid
//NIM : 24060122120035

public class Asersi1{
    public static void main(String[] args) {
        int x = 1;
        if (x > 0){
            System.out.println("x bilangan positif");
        }else{
            assert(x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}