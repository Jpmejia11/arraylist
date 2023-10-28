package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio6 {
    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Luis");

        if (nombres.size() >= 2) {
            nombres.set(1, "Ana");
            System.out.println("El segundo nombre ha sido cambiado a 'Ana'.");
        } else {
            System.out.println("No hay suficientes elementos en la lista para realizar el cambio.");
        }

        System.out.println("Lista de nombres actualizada:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}