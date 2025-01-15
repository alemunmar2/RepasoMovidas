import java.util.*;
public class Join {
    public static void main(String[] args) {

        List<String> color = new ArrayList<>();
        color.add("azul");
        color.add("verde");
        color.add("nigga");
        color.add("naranja");
        color.add("rojo");
        color.add("gris");


        List<String> pene = new ArrayList<>();
        pene.add("1");
        pene.add("2");
        pene.add("3");
        pene.add("4");
        pene.add("5");
        pene.add("6");


        List<String> fusion = new ArrayList<>();
        fusion.addAll(color);
        fusion.addAll(pene);

        System.out.println(fusion);


    }
}
