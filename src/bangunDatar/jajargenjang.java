package bangunDatar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Zainal
 */
public class jajargenjang extends BangunDatar{
    int alas,tinggi;
    
    public void setAlas(int alas){
        this.alas=alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    @Override
    public void setLuas(){
        this.Luas= alas*tinggi;
    }
    @Override
    public void setKeliling(){
        this.Keliling=2*(alas+tinggi);
    }
   
    
}
