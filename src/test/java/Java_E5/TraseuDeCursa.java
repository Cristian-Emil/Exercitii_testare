package Java_E5;

public class TraseuDeCursa {
    private int distanta;

    public TraseuDeCursa(int distanta) {
        this.distanta = distanta;
    }
    public TraseuDeCursa(){
        this.distanta =800;
    }
    public boolean masina_termina_cursa(Need_For_Speed masina1){
       if(masina1.distanta_parcursa() >= distanta && !masina1.baterie_descarcata()){
           return false;
       }
       return true;
    }

}
