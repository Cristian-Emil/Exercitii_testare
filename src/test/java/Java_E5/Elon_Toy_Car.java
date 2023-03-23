package Java_E5;

public class Elon_Toy_Car {

    static int baterie =100;
    private int total_distanta;


    public int condusa(){
        if(baterie>0) {
            baterie -= 1;
            return total_distanta += 20;
        }
        return 0;
    }
    public static Elon_Toy_Car buy(){
        return new Elon_Toy_Car();
    }
    public String afiseaza_distanta(){
        return "Condu " + total_distanta + " metri";
    }
    public String afiseaza_bateria() {
        if (baterie <=0){
            return "bateria este goala , nu te poti deplasa cu TESLA lui Elon";
        }
        return "Bateria este " + baterie + " %";
    }

}
