package Hashmaps;
import java.util.HashMap;
public class Vaciar {
    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "uno");
        mapa.put(2, "dos");
        mapa.put(3, "tres");
        mapa.put(4, "cuatro");

        System.out.println(mapa);
        System.out.println();

        mapa.clear();

        System.out.println(mapa);
    }
}
