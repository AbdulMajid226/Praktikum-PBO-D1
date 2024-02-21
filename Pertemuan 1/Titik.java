//Nama : Abdul Majid
//NIM  : 24060122120035
//Lab : D1

class Titik {
    double absis;
    double ordinat;
    static int counter;

    //method
    Titik(){
        counter ++;
        absis = 0;
        ordinat = 0;
    }
    Titik(double a , double o){
        counter ++;
        absis = a;
        ordinat = o;
    }
    public void setAbsis(double absis){
        this.absis = absis;
    }
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    public int getCounter(){
        return counter;
    }
    
}