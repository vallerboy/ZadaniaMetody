package pl.akademiakodu;

/**
 * Created by OskarPraca on 2017-03-14.
 */
public class Zadanie14 {


    // 16 24

    // 24 - 16 = 8 - b
    // 16 - a

    // 8 - b
    // 16 -8 = 8 - a



    public int NWD(int a, int b){
        while( a != b) {
          if ( a > b) {
             a = a - b;
          }else {
             b = b - a;
          }
        }
        return a;
    }

}
