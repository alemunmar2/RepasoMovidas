import java.util.*;
public class Buscar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> color = new ArrayList<>();
        color.add("azul");
        color.add("verde");
        color.add("nigga");
        color.add("naranja");
        color.add("rojo");
        color.add("gris");

          if (color.contains("azul")) {
              System.out.println("Esta");
          }else {
              System.out.println("No esta en la lista");
          }


    }
}
