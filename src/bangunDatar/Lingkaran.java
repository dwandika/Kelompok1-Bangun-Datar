package bangunDatar;






/**
 *
 * @author Andika
 */
public class Lingkaran extends  BangunDatar{
    
    double diameter,r;
    
    public void setDiameter(double diameter){
    this.diameter = diameter;
    }
    public void setJari(){
    this.r = diameter / 2;
    }
    @Override
    public void setLuas(){
        this.Luas = Math.PI *r*r;
    }
    public void seKeliling(){
    this.Keliling = Math.PI*diameter;
    }
    
}
