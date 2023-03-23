package Java_E6.Principii_OOP;

public abstract class Bonus_INCAPSULARE extends Salariile_Angajatilor {

        int ORE = 168;
        int MEDIE_ORARA = 255;


    double Salariu_fix() {
        return Salariu_fix;
    }
    protected final double Salariu_fix = ORE * MEDIE_ORARA;
    protected double calcul_salarial() {
        return Salariu_fix + bonusuri;
    }
    @Override
    public String getnume() {
        return "Angajatul se numeste" + Prenume + " " + Nume;
    }

}
