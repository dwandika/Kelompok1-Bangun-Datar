package bangunDatar;


/**
 *
 * @author Andika
 */
public class Main {

    public static void main(String[] args) {
       
        Trapesium tp = new Trapesium();
        tp.setTinggi(7);
        tp.setsisiA(12);
        tp.setsisiB(10);
        tp.setluas();
        tp.setkeliling();
        
        System.out.println("---------------- TRAPESIUM ----------------");
        System.out.println("Luas Trapesium = "+tp.getLuas());
        System.out.println("Keliling Trapesium =  "+tp.getKeliling());
        System.out.println("-------------------------------------------\n\n");
     
    }
}
