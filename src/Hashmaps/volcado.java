package Hashmaps;
import java.util.*;
public class volcado {
    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "uno");
        mapa.put(2, "dos");
        mapa.put(3, "tres");
        mapa.put(4, "cuatro");

        HashMap<Integer, String> mapa2 = new HashMap<Integer, String>();
        mapa.put(14, "uno");
        mapa.put(21, "dos");
        mapa.put(3, "tres");
        mapa.put(477, "cuatro");

        System.out.println(mapa);
        System.out.println();
        System.out.println(mapa2);

        mapa2.putAll(mapa);

        System.out.println(mapa);
        System.out.println();
        System.out.println(mapa2);



    }
}
