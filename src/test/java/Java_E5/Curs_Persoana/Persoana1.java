package Java_E5.Curs_Persoana;

public class Persoana1 {

    public static void main(String[] args){
        Persoana1 P= new Persoana1();
        P.nume= "Vasile";
    }

    private String nume;
    private String prenume;
    private long CNP = 1234567891;
    private String data_nastere;

//click dreapta si alelegem GENERATOR si setam GETTER sau SETTER

     public String getNume() {
       return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public long getCNP() {
        return CNP;
    }

    public String getData_nastere() {
        return data_nastere;
    }

    public void setData_nastere(String data_nastere) {
        this.data_nastere = data_nastere;
    }
}
