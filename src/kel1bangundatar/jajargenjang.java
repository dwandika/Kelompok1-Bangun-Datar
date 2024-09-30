/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kel1bangundatar;

/**
 *
 * @author ADMIN
 */
public class jajargenjang {
    int alas,tinggi,panjang,lebar,luas,keliling;
    
    public void setAlas(int alas){
        this.alas=alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    public void setPanjang(int pnjang){
        this.panjang=panjang;
    }
    public void setLebar(int lebar){
        this.lebar=lebar;
    }
    public void setLuas(){
        this.luas= alas*tinggi;
    }
    public void setKeliling(){
        this.keliling=2*(alas+tinggi);
    }
    public int getLuas(){
        return luas;
    }
    public int getKeliling(){
        return keliling;
    }
    
}
