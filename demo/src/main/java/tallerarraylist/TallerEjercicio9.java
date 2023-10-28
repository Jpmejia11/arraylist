package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio9 {
    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Luis");

        String nombreBuscado = "Carlos";

        if (nombres.contains(nombreBuscado)) {
            System.out.println("El nombre " + nombreBuscado + " está en la lista.");
        } else {
            System.out.println("El nombre " + nombreBuscado + " no está en la lista.");
        }
    }
}