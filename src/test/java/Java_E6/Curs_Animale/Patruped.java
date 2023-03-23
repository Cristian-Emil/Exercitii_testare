package Java_E6.Curs_Animale;   //Aceasta este o clasa

public class Patruped implements Mamifere, Animal_Domestic {
    @Override
    public void mananca() {
        System.out.println("Eu sunt animal patruped de pe langa casa omului si sunt CAINE " );
    }
    @Override
    public void merge() {
        System.out.println("Eu merg sau alerg" );
    }
    @Override
    public void sunete() {
        System.out.println("Eu latru cand simt pericolul sau cand ma bucur" );
    }
    @Override
    public void reproducere() {
        System.out.println("Imi harnesc puii cu lapte in primele 6 luni de zile" );
    }
    @Override
    public void vaneaza() {
        System.out.println("Vanez doar daca sunt antrenat pentru asa ceva" );
    }



// Clasele trebuie sa vina cu implementarea din toate INTERRFETELE - aici interfete sunt Mamifere si Salbaticiune
}
