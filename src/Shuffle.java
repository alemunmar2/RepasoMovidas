import java.util.*;
public class Shuffle {
    public static void main(String[] args) {

        List<String> color = new ArrayList<>();
        color.add("azul");
        color.add("verde");
        color.add("nigga");
        color.add("naranja");
        color.add("rojo");
        color.add("gris");

        Collections.shuffle(color);

        System.out.println(color);


    }
}
