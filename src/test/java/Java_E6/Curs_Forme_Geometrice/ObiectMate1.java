package Java_E6.Curs_Forme_Geometrice;

public abstract class ObiectMate1 {
// atribute
    public double x, y ;

// constructori
    ObiectMate1(){
    x = 7.1;
    y = -2.5;
    }

    ObiectMate1(double x, double y){
        this.x = x;
        this.y = y;
    }

// metode
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public abstract double aria();

    public abstract double perimetru();

}
