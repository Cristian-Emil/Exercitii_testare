package Java_E5;

public class Elon_masinuta {

    private static int baterie =100;
    private int total_distanta;

    public static void main(String[] args){
/*       Elon_masinuta masina = new Elon_masinuta(); - este o varianta dar daca nu dorin
            sa apara new ( apelarea unei noi clase )    */
        Elon_masinuta masina1 = Elon_masinuta.buy();
        Elon_masinuta masina2 = Elon_masinuta.buy();
        /*          folosim direct metoda ceruta, in acest caz fac functia de mai jos STATICA    */
        System.out.println(masina1.afiseaza_distanta() + " - nu am condus masina pana in acest moment");
        System.out.println(masina1.afiseaza_bateria() + " - bateria este neutilizata ");
        masina1.condusa();

//  1-  Prima varinata e cea cu WHILE si ciclul merge foarte bine
//        while(baterie !=0){
//            masina1.condusa();
//            if(baterie ==50){
//                System.out.println(masina1.afiseaza_distanta());
//                System.out.println(masina1.afiseaza_bateria());
//            }
//        }


//  2-  A doua varianta este cea cu IF dar aceasta nu opreste ciclul la 0%, masina merge pe baterie negativa
//      Trebuie sa punem conditia ca masina sa nu mai mearga cand bateria este la 0%

        for(int i=0; i<100; i++) {
            masina1.condusa();
        }
            System.out.println(masina1.afiseaza_distanta());
            System.out.println(masina1.afiseaza_bateria());
    }
    public int condusa(){
        if(baterie>0) {
            baterie -= 1;
            return total_distanta += 20;
        }
        return 0;
    }
    public static Elon_masinuta buy(){
        return new Elon_masinuta();
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
