package bangunDatar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Aprilia
 */
public class PersegiPanjang extends BangunDatar{
    int p,l;
    public void setPanjang(int p) {
        this.p = p;
    }
    public void setLebar(int L) {
        this.l= L;
    }
    @Override
    public void setLuas() {
        this.Luas = p * l;
    }
    @Override
    public void setKeliling() {
        this.Keliling = 2 * (p+l);
   
}
}
    

