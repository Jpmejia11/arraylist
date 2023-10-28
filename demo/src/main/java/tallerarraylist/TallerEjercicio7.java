package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio7 {
    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Luis");

        if (!nombres.isEmpty()) {
            // Eliminar el primer nombre (índice 0)
            nombres.remove(0);
            System.out.println("Primer nombre eliminado con éxito.");
        } else {
            System.out.println("El ArrayList de nombres está vacío.");
        }
        
        System.out.println("ArrayList de nombres después de eliminar el primer nombre:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}