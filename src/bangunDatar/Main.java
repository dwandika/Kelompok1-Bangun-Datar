package bangunDatar;

/**
 *
 * @author Andika
 */
public class Main {

    public static void main(String[] args) {
        Persegi pr = new Persegi();
        pr.setsisi(12);
        pr.setluas();
        pr.setkeliling();

        System.out.println("----------------- PERSEGI -----------------");
        System.out.println("Luas Persegi = " + pr.getLuas());
        System.out.println("Keliling Persegi = " + pr.getKeliling());
        System.out.println("-------------------------------------------\n\n");

    }
}
