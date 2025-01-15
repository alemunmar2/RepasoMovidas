import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swap {
    public static void main(String[] args) {

        List<String> color = new ArrayList<>();
        color.add("azul");
        color.add("verde");
        color.add("nigga");
        color.add("naranja");
        color.add("rojo");
        color.add("gris");

        Collections.swap(color, 0, 2);
        for (String a : color){
            System.out.println(a);
        }

    }
}
