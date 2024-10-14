package bangunDatar;


/**
 *
 * @author Andika
 */
public class Main {

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(7);
        pp.setLebar(5);
        pp.setLuas();
        pp.setKeliling();
        
        System.out.println("------------- PERSEGI PANJANG -------------");
        System.out.println("Luas Persegi Panjang = "+pp.getLuas());
        System.out.println("Keliling Persegi Panjang = "+pp.getKeliling());
        System.out.println("-------------------------------------------\n\n");
    }
}
