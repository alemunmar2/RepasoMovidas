import java.util.*;
public class insertar {
    public static void main(String[] args) {

        List<String> color = new ArrayList<>();
        color.add("azul");
        color.add("verde");
        color.add("nigga");
        color.add("naranja");
        color.add("rojo");
        color.add("gris");

        System.out.println(color);

        color.addFirst("polla");
        System.out.println(color);
    }
}
