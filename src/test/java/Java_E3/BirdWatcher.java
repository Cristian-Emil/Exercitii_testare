package Java_E3;

public class BirdWatcher {

    public static void main(String[] args) {

        final int[] pasaripesaptamana = {2, 5, 8, 7, 4, 1};
        getlastweek(pasaripesaptamana);// avem comanda de tiparire in linia "for"
        System.out.println(gettoday(pasaripesaptamana));
        System.out.println(incrementtodaycount(pasaripesaptamana));
        System.out.println(hasdaywithoutbirds(pasaripesaptamana));
        System.out.println(getcountforfistdays(pasaripesaptamana, 4));
        System.out.println("Numar de zile cu mai mult de 5 pasari este = " + getbusydays(pasaripesaptamana));

    }

    static void getlastweek(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }

    static int gettoday(int[] array) {
        return array[array.length - 1];
    }

    static int incrementtodaycount(int[] array) {
        return ++array[array.length - 1];
    }

    static boolean hasdaywithoutbirds(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {
                return true;
            }
        }
            return false;
        }
    static int getcountforfistdays (int[] array, int days){
    int suma=0;
    for (int i=0; i<days; i++) {
        suma += array[i];
       }
    return suma;
    }
    static int getbusydays(int[]array) {
        int busydays = 0;
        int i;
        for (i = 0; i<array.length - 1; i++){
            if (array[i] > 5) {
                busydays++;
            }
        }
        return busydays;
   }
}
