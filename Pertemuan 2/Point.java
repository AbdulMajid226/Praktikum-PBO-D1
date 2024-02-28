//Nama : Abdul Majid
//NIM  : 24060122120035
//Lab : D1

public class Point {
    //Atribut
    private double x,y;

    //Method
    //Konstruktor
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    //Setter
    public void setAbsis(double x){
        this.x = x;
    }

    public void setOrdinat(double y){
        this.y = y;
    }

    //Getter
    public double getAbsis(){
        return this.x;
    }

    public double getOrdinat(){
        return this.y;
    }

    //Operasi pada Titik
    public double getJarakPusat(){
        return Math.sqrt(x*x + y*y);
    }

    public void reflexiX(){
        this.y = -y;
    }
    public void reflexiY(){
        this.x = -x;
    }
    public Point getRefleksiX(){
        Point t = new Point(x,-y);
        return t;
    }
    public Point getReflexiY(){
        Point t = new Point(-x,y);
        return t;
    }
}




