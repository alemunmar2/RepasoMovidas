package Hashmaps;
import java.util.HashMap;

public class Comprobar_con_booleano {
    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "uno");
        mapa.put(2, "dos");
        mapa.put(3, "tres");
        mapa.put(4, "cuatro");

        boolean resultado = !mapa.isEmpty(); // Verifica si el mapa no está vacío

        if (resultado) { // Usa 'if (resultado)' para evaluar directamente el booleano
            System.out.println("Lleno");
        } else {
            System.out.println("Vacío");
        }

        mapa.clear(); // Vacía el mapa

        resultado = !mapa.isEmpty(); // Actualiza la variable resultado después de modificar el mapa

        if (resultado) {
            System.out.println("Lleno");
        } else {
            System.out.println("Vacío");
        }
    }
}
