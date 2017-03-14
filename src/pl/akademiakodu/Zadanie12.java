package pl.akademiakodu;

/**
 * Created by OskarPraca on 2017-03-14.
 */
public class Zadanie12 {


    // PRACA SAMODZIELNA GRUPOWA

    public int najwiekszaIloscDziel() {
        int iloscDziel = 0;
        int liczba  = 0;

        for(int i = 2; i <= 10000; i++) {
             int iloscDzielLokal = iloscDzielnikow(i);
             if(iloscDziel < iloscDzielLokal) {
                 iloscDziel = iloscDzielLokal;
                 liczba = i;
             }
        }
        return liczba;
    }


    public int iloscDzielnikow(int a){
        int dzielniki = 0;
        for(int i = 1; i <= a; i++) {
            if(a % i == 0) {
                dzielniki++;
            }
        }
        return dzielniki;
    }

}
