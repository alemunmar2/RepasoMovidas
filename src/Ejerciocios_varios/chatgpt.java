package Ejerciocios_varios;
import java.util.*;
public class chatgpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> mapa = new HashMap<String, String>();
        ArrayList<String> introcudido = new ArrayList<String>();
        String continuar;
        Stack<String> pila = new Stack<String>();


        do {
            System.out.println("Dime una tarea");
            String clave = sc.next();
            System.out.println("Dime su prioridad");
            String texto = sc.next();
            mapa.put(clave,texto);
            System.out.println("Quieres añadir mas tareas? si o no");
            continuar = sc.next();
        }while (continuar.equals("si"));

        Set<String> keys = mapa.keySet();
        System.out.println("Este es el historial");



        List<String> ordenado = new ArrayList<>(keys);

        System.out.println(keys);

        Collections.sort(ordenado);
        System.out.println();
        System.out.println(ordenado);

    }
}
