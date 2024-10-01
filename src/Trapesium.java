

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author coldp
 */
public class Trapesium {
    int sisiA,sisiB,Tinggi;
    double luas,keliling;
    
    public void setsisiA(int sisiA){
        this.sisiA = sisiA;
    }
    public void setsisiB(int sisiB){
        this.sisiB = sisiB;
    } 
    public void setTinggi(int Tinggi){
        this.Tinggi = Tinggi;
    }
    public void setkeliling(){
        this.keliling = sisiA + sisiB + sisiA + sisiB;
    }  
    public void setluas(){
        this.luas = 0.5*(sisiA+sisiB)*Tinggi;
    }
    public double getluas(){
        return luas;
    }
    public double getkeliling(){
        return keliling;
    }

    void luas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void keliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getLuas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getKeliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
