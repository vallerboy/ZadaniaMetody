package pl.akademiakodu;

/**
 * Created by OskarPraca on 2017-03-14.
 */
public class Zadanie9 {


    public boolean jestSzescianem(int a){
        for(int i = 1; i <= a; i++) {
            if(i * i * i == a) {
                  return true;
            }
        }
        return false;
    }


}
