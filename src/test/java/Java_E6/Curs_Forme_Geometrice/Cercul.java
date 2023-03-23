package Java_E6.Curs_Forme_Geometrice;

public class Cercul extends ObiectMate1 {
    public double raza;
    double aria;
    double perimetru;

    public Cercul(double raza, double x, double y){
        super(x,y);
        this.raza = raza;

    }

    public double aria(){
        return Math.PI * raza * raza;
    }
    public double perimetru() {
        return 2 * Math.PI * raza;
    }
}
