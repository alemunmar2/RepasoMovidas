import java.util.*;
public class Ordenar {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();
        color.add("azul");
        color.add("verde");
        color.add("nigga");
        color.add("naranja");
        color.add("rojo");
        color.add("gris");


        System.out.println("Sin ordenar: ");
        System.out.println(color);
        System.out.println();
        System.out.println("Ordenada:");
        System.out.println();
        Collections.sort(color);
        System.out.println(color);

    }
}
