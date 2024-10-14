package bangunDatar;


/**
 *
 * @author Andika
 */
public class Main {

    public static void main(String[] args) {
        
        jajargenjang jj = new jajargenjang();
        jj.setAlas(19);
        jj.setTinggi(9);
        jj.setLuas();
        jj.setKeliling();
        
        System.out.println("------------- JAJARGENJANG -------------");
        System.out.println("Luas Jajargenjang = "+jj.getLuas());
        System.out.println("Keliling Jajargenjang = "+jj.getKeliling());
        System.out.println("-------------------------------------------\n\n");
    }
}
