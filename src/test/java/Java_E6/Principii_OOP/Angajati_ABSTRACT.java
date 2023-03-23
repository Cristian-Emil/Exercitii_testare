package Java_E6.Principii_OOP;

public abstract class Angajati_ABSTRACT {

    protected String Prenume;
    protected String Nume;
    protected int varsta;
    protected String ziua_de_angajare;
    protected int bonusuri;
    protected Angajati_ABSTRACT() { }

    public abstract void Prenume();
    public abstract void Nume();
    public abstract void varsta();
    public abstract void ziua_de_angajare();
    protected abstract double calcul_salarial();
    public abstract String getnume();

    public Angajati_ABSTRACT(String prenume, String nume, int varsta, String ziua_de_angajare, int bonusuri) {
        Prenume = "Popica";
        Nume = "Popescu";
        this.varsta = 40;
        this.ziua_de_angajare = "15.08";
        this.bonusuri = 500;
    }
//Generare GETTER
//    public String getPrenume() {
//        return Prenume; }
//
//    public String getNume() {
//        return Nume; }
//
//    public int getVarsta() {
//        return varsta; }
//
//    public String getZiua_de_angajare() {
//        return ziua_de_angajare; }
//
//    public int getBonusuri() {
//        return bonusuri; }

//Generare SETTER
    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setZiua_de_angajare(String ziua_de_angajare) {
        this.ziua_de_angajare = ziua_de_angajare;
    }

    public void setBonusuri(int bonusuri) {
        this.bonusuri = bonusuri;
    }

}
