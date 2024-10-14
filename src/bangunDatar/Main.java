package bangunDatar;


/**
 *
 * @author Andika
 */
public class Main {

    public static void main(String[] args) {
      
        Segitiga sg = new Segitiga();
        sg.setAlas(10);
        sg.setTinggi(7);
        sg.setSisi(9);
        sg.setLuas();
        sg.setKeliling();

        System.out.println("----------------- SEGITIGA ----------------");
        System.out.println("Luas Segitiga = " + sg.getLuas());
        System.out.println("Keliling Segitiga = " + sg.getKeliling());
        System.out.println("-------------------------------------------\n\n");

    }
}
