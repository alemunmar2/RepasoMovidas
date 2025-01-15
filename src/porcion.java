import java.util.*;
public class porcion {
    public static void main(String[] args) {

        List<String> color = new ArrayList<>();
        color.add("azul");
        color.add("verde");
        color.add("nigga");
        color.add("naranja");
        color.add("rojo");
        color.add("gris");

        List<String> porcion = color.subList(0, 3);
        System.out.println(porcion);




    }
}
