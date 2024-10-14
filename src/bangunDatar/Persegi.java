package bangunDatar;


/**
 *
 * @author Shifaa
 */
public class Persegi extends BangunDatar{
    int sisi;
    
    public void setsisi(int sisi) {
        this.sisi = sisi;
    }
    public void setluas() {
        this.Luas = sisi * sisi;
    }
    public void setkeliling() {
        this.Keliling = sisi + sisi + sisi;
    }
   

    
}
