




/**
 *
 * @author Andika
 */
public class Lingkaran {
    
    double diameter,r,luas,keliling;
    
    public void setDiameter(double diameter){
    this.diameter = diameter;
    }
    public void setJari(){
    this.r = diameter / 2;
    }
    public void setLuas(){
        this.luas = Math.PI *r*r;
    }
    public void seKeliling(){
    this.keliling = Math.PI*diameter;
    }
    public double getLuas(){
        return luas;
    }
    public double getKeliling(){
    return keliling;
    }
}
