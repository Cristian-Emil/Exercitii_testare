package Java_E5;
import Java_E5.Curs_Persoana.Persoana1;

public class Main {
    public static void main(String[] args) {
//          exe1();     //  Elon_Toy_Car
//          exe2();     //  Curs_persona/Persoana1
          exe3();     //  Need_for_Speed
//          exe4();     //  Absrtract


        System.out.println("\n");
    }

    /*===================================================================================================================*/
// Incercam sa accesam de aici functionarea jucariei lui Elon
    static void exe1() {
        Elon_Toy_Car car = Elon_Toy_Car.buy();
        System.out.println(car.afiseaza_distanta() + " - nu am condus masina pana in acest moment");
        System.out.println(car.afiseaza_bateria() + " - bateria este neutilizata ");

        for (int i = 0; i < 100; i++) {
            car.condusa();
        }
        System.out.println(car.afiseaza_distanta());
        System.out.println(car.afiseaza_bateria());
        System.out.println("\n");
    /* aici avem metoda de INCAPSULARE. Nu putem sa vedem care sunt anumite caracteristici - baterie sau distanta  -
    pentru ca sunt private in clasa Elon_Toy_Car( adica incapsulate )
         */
    }

    /*===================================================================================================================*/
// Incercam sa accesam de aici nume din Persoana1 din Curs_Persoana
    static void exe2() {
        Persoana1 P = new Persoana1();
        P.setNume("Ion");
        System.out.println((P.getCNP()));
        System.out.println("\n");
    }

    /*===================================================================================================================*/
// Cursa de Need For Speed
    static void exe3() {

        Need_For_Speed masina1 = new Need_For_Speed(2, 5);
        int LungimeTraseu = 300;
        TraseuDeCursa Traseu = new TraseuDeCursa(LungimeTraseu);
        TraseuDeCursa Traseu2Default = new TraseuDeCursa();
        System.out.println("Lungimea traseului este de = " + LungimeTraseu);
        Need_For_Speed nitro_Masina = Need_For_Speed.nitro(); // aici este difinit obiectul masinuta nitro
        while (nitro_Masina.baterie > 0) {
            nitro_Masina.conducem();
            System.out.println("Distanta parcursa = " + nitro_Masina.distanta_parcursa);
            System.out.println("Procentaj baterie ramasa = " + nitro_Masina.baterie + "%");
            System.out.println("Bateria este goala ? - " + nitro_Masina.baterie_descarcata());
            System.out.println(Traseu.masina_termina_cursa(nitro_Masina));
            System.out.println("==============================================================================");
            System.out.println("\n");
        }
    }
    /*===================================================================================================================*/
//  Abstract - folosirea claselor abstracte
      static void exe4(){
    int x = 3;
        System.out.println(x < 11 ? "Este mai mic ca 11":" Nu este mai mic ca 11");
}

}
