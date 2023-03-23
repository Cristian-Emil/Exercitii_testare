package Java_E5.Razboi;

    public class Razboinic extends Luptator {

        public static void main(String[] args) {
            Razboinic razboinic = new Razboinic();
            System.out.println("Este razboinicul vulnerabil? - " + razboinic.este_vulnerabil());
            Vrajitor vrajitor = new Vrajitor();
            vrajitor.pregateste_vraja();
            System.out.println("=====================");
            System.out.println("Puncte de distrugere " + razboinic.puncte_distrugere(vrajitor));
            System.out.println("Puncte de distrugere " + vrajitor.puncte_distrugere(razboinic));

            System.out.println("=====================");
            System.out.println("Puncte de distrugere " + razboinic.puncte_distrugere(vrajitor));
            System.out.println("Puncte de distrugere " + vrajitor.puncte_distrugere(razboinic));

            vrajitor.pregateste_vraja();
            System.out.println("=====================");
            System.out.println("Puncte de distrugere " + razboinic.puncte_distrugere(vrajitor));
            System.out.println("Puncte de distrugere " + vrajitor.puncte_distrugere(razboinic));

            System.out.println("=====================");
            System.out.println("Puncte de distrugere " + razboinic.puncte_distrugere(vrajitor));
            System.out.println("Puncte de distrugere " + vrajitor.puncte_distrugere(razboinic));


        }

        @Override
        int puncte_distrugere(Luptator luptator) {
            return luptator.este_vulnerabil()? 10:6;  // este in loc de IF - daca este vulnerabil este 10 altfel e 6
        }

        @Override
        public String toString() {
            return "Luptator este " + this.getClass().getSimpleName();
        }
    }
