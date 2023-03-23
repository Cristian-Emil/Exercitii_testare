package Java_E6.Curs_Persoana;

public class Persoana {

    public static String adresa;
    public Object Curs_Persoana;

// aici avem ATRIBUTELE - sunt marimile care caratcterizeaza cine face actiunea
    public String nume;
    public int varsta;
    public int inaltime;
    public int greutate;
// aici avem CONSTRUCTORUL - aici definim logica de constructie a actiunilor
    public Persoana(){
    nume = "Cristian";
    varsta =  25;
    inaltime = 183;
    greutate = 110;
    Persoana.adresa = "Locuiesc la adresa din buletin";
    }
    public Persoana(String nume, int varsta, int inaltime, int greutate ) {
        this.nume =  nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.greutate = greutate;
    }
// aici avem METODELE - sunt marimile care descriu actiunea

    public void salutare() {
        System.out.println("Salut, eu sunt " + nume);
    }
    public void plimbare(){
        System.out.println("Ma plimb pe strada singur si fericit.");
    }
    public void asteptare(){
        System.out.println("Astept pe cineva la cina.");
    }

}
