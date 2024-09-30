
/**
 *
 * @author Andika
 */
public class Main {

    public static void main(String[] args) {
        Lingkaran lk = new Lingkaran();
        lk.setDiameter(14);
        lk.setJari();
        lk.seKeliling();
        lk.setLuas();

        System.out.println("---------------- LINGKARAN ----------------");
        System.out.println("Luas Lingkaran = " + lk.getLuas());
        System.out.println("Keliling Lingkaran = " + lk.getKeliling());
        System.out.println("-------------------------------------------\n\n");

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

        Persegi pr = new Persegi();
        pr.setsisi(12);
        pr.setluas();
        pr.setkeliling();
        
        System.out.println("----------------- PERSEGI -----------------");
        System.out.println("Luas Persegi = "+pr.getluas());
        System.out.println("Keliling Persegi = "+pr.getkeliling());
        System.out.println("-------------------------------------------\n\n");
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(7);
        pp.setLebar(5);
        pp.setLuas();
        pp.setKeliling();
        
        System.out.println("------------- PERSEGI PANJANG -------------");
        System.out.println("Luas Persegi Panjang = "+pp.getLuas());
        System.out.println("Keliling Persegi Panjang = "+pp.getKeliling());
        System.out.println("-------------------------------------------\n\n");
        
        Trapesium tp = new Trapesium();
        tp.setTinggi(7);
        tp.setsisiA(12);
        tp.setsisiB(10);
        tp.setluas();
        tp.setkeliling();
        
        System.out.println("---------------- TRAPESIUM ----------------");
        System.out.println("Luas Trapesium = "+tp.getluas());
        System.out.println("Keliling Trapesium =  "+tp.getkeliling());
        System.out.println("-------------------------------------------\n\n");
        
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
