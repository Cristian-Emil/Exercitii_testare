package Java_E5;

public class Need_For_Speed {
    public int baterie = 100;
    public int bateria_descarcata;
    public int speed;

    public int distanta_parcursa;



//        masina1.conducem();
//        masina1.conducem();
//        System.out.println("Distanta partcursa = " + masina1.distanta_parcursa);
//        System.out.println("Procentaj baterie ramasa = " + masina1.baterie + "%");
//        System.out.println("Bateria este goala ? - " + masina1.baterie_descarcata());


    public static Need_For_Speed nitro(){
        return new Need_For_Speed (4, 50);
    }

    public Need_For_Speed(int bateria_descarcata, int speed) {
        this.bateria_descarcata = bateria_descarcata;
        this.speed = speed;
    }

    public int distanta_parcursa(){
        return distanta_parcursa;
    }

    public void conducem() {
        if (baterie > 0) {
            distanta_parcursa += speed;
            baterie -= bateria_descarcata;
        }
        return; // la baterie ZERO iese din ciclu in mod automat
    }

    public boolean baterie_descarcata() {
//        System.out.println(" Bateria este incarcata = " + baterie_descarcata());
//        return baterie <= 0;
    if(baterie<=0) {
        return true;
    }
    return false;
   }

}
