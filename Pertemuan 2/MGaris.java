//Nama : Abdul Majid
//NIM  : 24060122120035
//Lab : D1

public class MGaris {
    public static void main(String args[]){
        
        Garis g1 = new Garis();
        g1.setTawal(1, 5);        
        g1.setTakhir(4, 9);
        
        System.out.println("Garis:"+ "("+g1.getTawal().getAbsis()+" , "+g1.getTawal().getOrdinat()+")"+"("+g1.getTakhir().getAbsis()+" , "+g1.getTakhir().getOrdinat()+")");
        
        g1.printGaris(g1);

        System.out.println("getPanjang : "+ g1.getPanjang());
        System.out.println("getGradien : " + g1.getGradien());

        Garis g2 = g1.getReflexiYGaris();
        g2.printGaris(g2); 

        System.out.println("isTegakLurus : "+ g1.isTegakLurus(g2));
    }
}
