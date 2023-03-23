package Java_E5.Razboi;

public class Vrajitor extends Luptator {

    private int vraja;

    public void pregateste_vraja(){
        vraja++;
    }

    @Override
    boolean este_vulnerabil() {
        return vraja ==0;
    }

    @Override
    int puncte_distrugere(Luptator luptator) {
        if (vraja == 0){
            return 3;
        }
            vraja --;
            return 15;
        }

    @Override
    public String toString() {
        return "Luptator este " + this.getClass().getSimpleName();
    }
}