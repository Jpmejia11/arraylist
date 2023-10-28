package tallerarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TallerEjercicio15 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Luis");

        Collections.sort(nombres);

        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}