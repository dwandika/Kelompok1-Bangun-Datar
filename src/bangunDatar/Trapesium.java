package bangunDatar;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author coldp
 */
public class Trapesium extends BangunDatar{
    double sisiA,sisiB,Tinggi;
    
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
        this.Keliling = sisiA + sisiB + sisiA + sisiB;
    }  
    public void setluas(){
        this.Luas = 0.5*(sisiA+sisiB)*Tinggi;
    }
   
}
