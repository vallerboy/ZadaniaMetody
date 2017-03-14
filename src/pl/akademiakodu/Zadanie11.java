package pl.akademiakodu;

/**
 * Created by OskarPraca on 2017-03-14.
 */
public class Zadanie11 {

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
