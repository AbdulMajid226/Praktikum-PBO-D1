//Nama : Abdul Majid
//NIM : 24060122120035



public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        else{
            System.out.println("Angka "+angka+" bukan angka sial");
        }
    }
    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}

//*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//jawab : baris 12 tetap dieksekusi sekali pada angka 10 dan pada angka 13 langsung kelempar ke AngkaSialException , lalu langsung masuk kecatch dan menampilkan "Angka 13, angka sial bos" dan "hati-hati memasukkan angka" 

//*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
//jawab : dieksekusi karena pada angka 13 dia ada error AngkaSialException dan langsung masuk kecatch 