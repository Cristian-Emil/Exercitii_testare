package Java_E6.Curs_Trainer;

public class Persoana2 {
        public String nume;
        public int varsta;
        public String adresa;
        public void salutare() {
           System.out.println("Salut, eu sunt " + nume);
        }
        public void am_atatia_ani(){
            System.out.println("Eu am " + varsta + " ani");
        }
        public void adresa(){
            System.out.println(adresa + " de multi ani");
    }
        public static void main(String[] args) {
            Persoana2 cetatean1 = new Persoana2();
            cetatean1.nume = "Mandache";
            cetatean1.varsta = 35;
            cetatean1.adresa = "Locuiesc in Eforie";
            cetatean1.salutare();
            cetatean1.am_atatia_ani();
            cetatean1.adresa();
        }
}
