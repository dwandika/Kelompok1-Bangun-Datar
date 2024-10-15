package bangunDatar;


/**
 *
 * @author MyBook Hype
 */
public class Segitiga extends BangunDatar{
    double Sisi, alas, tinggi;
    public void setSisi(double sisi) {
        this.Sisi = sisi;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    @Override
    public void setLuas() {
        this.Luas = 0.5 * alas * tinggi;
    }
    @Override
    public void setKeliling() {
        this.Keliling = Sisi + Sisi + Sisi;
    }
}
