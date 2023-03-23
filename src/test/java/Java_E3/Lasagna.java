package Java_E3;

public class Lasagna {

//  PROGRAMUL CALCULEAZA TIMPUL DE PREPARARE AL UNEI LASAGNA IN FUNCTIE DE DATELE DE INTRARE

    public static void main(String[] args) {
        System.out.println(" ");
        expectedMinutesInOven();
        remainingMinutesInOven(30);
        preparationTimeInMinutes(2);
        totalTimeInMinutes(3,20);
    }

        private static int MINIM_MINUTE = 0;
        private static int MAXIM_MINUTE = 40;
        private static int MINIM_LAYER = 0;
        private static int MINUTE_LAYER = 2;

    public static int expectedMinutesInOven() {
            int i = MAXIM_MINUTE;
            System.out.println(" Timpul maxim estimat este " + i + " minute" );
            return i;
    }
    public static int remainingMinutesInOven( int minute_pass) {
        if (minute_pass >= MINIM_MINUTE && minute_pass <= MAXIM_MINUTE) {
            int i = MAXIM_MINUTE - minute_pass;
            System.out.println(" Timpul ramas este " + i + " minute" );
            return i;
        }
        else {
            return 0;
        }
    }
    public static int preparationTimeInMinutes(int layers) {
        if (layers > MINIM_LAYER ){
            int i = layers * MINUTE_LAYER;
            System.out.println(" Numarul de straturi " + i );
            return i ;
        }
        else {
            return 0;
        }
    }
    public static int totalTimeInMinutes(int layers, int minute_pass) {
        if (layers > MINIM_LAYER && minute_pass >= MINIM_MINUTE && minute_pass <= MAXIM_MINUTE) {
            int i = minute_pass + (layers * MINUTE_LAYER);
            System.out.println(" Timpul total este " + i + " minute" );
            return i;
        }
        else {
            return 0;
        }
    }
}


