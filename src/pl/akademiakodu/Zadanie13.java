package pl.akademiakodu;

/**
 * Created by OskarPraca on 2017-03-14.
 */
public class Zadanie13 {

     public double potega(int a, int n){
         return Math.pow(a, n);
     }

     public int potega1(int a, int n) {
         int wynik = 1;
         for(int i = 1; i <= n; i++) {
             wynik *= a;
         }
         return wynik;
     }


}
