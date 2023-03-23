package Java_E6.Diverse_Clase;

public class Sub_Clasa1 extends Super_Clasa1{
// METODELE sunt ofisati de la cel la restrictiv spre cel mai putin restricitv

//   modificatorul PRIVATE nu poate sa fie apelat din alta clasa, doar din cea unde a fost definit

        @Override
    public void metoda_IMPLICITA(){
        System.out.println("Metoda IMPLICITA din Sub_Clasa1 se tipareste - este suprascrisa");
    }
    @Override
    public void metoda_PROTECTED(){
        System.out.println("Metoda PROTECTED din Sub_Clasa1 se tipareste - este suprascrisa");
    }

    public void metoda_PUBLIC(){
        System.out.println("Metoda PUBLIC din Sub_Clasa1 - tiparita din orice clasa");
    }
}
