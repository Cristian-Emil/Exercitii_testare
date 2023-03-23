package Java_E6.Principii_OOP;

public abstract class Salariile_Angajatilor extends Angajati_ABSTRACT {

      protected Salariile_Angajatilor() { }

    protected Salariile_Angajatilor(String Prenume, String Nume, int varsta, String ziua_de_angajare,int bonusuri) {
        super( Prenume, Nume, varsta, ziua_de_angajare, bonusuri);
    }
    @Override
    protected double calcul_salarial() {
        return 0;
    }

    public void ABSTRACT_Angajati(){
        System.out.println("Tabelul cu datele angajatilor");
    }

}
