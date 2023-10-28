package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio17 {
    public static void main(String[] args) {
       
        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("Hola");
        cadenas.add("Mundo");
        cadenas.add("en");
        cadenas.add("Java");

        
        if (!cadenas.isEmpty()) {
            
            int ultimoIndice = cadenas.size() - 1;
            String ultimoElemento = cadenas.get(ultimoIndice);
            System.out.println("El último elemento del ArrayList es: " + ultimoElemento);
        } else {
            System.out.println("El ArrayList de cadenas está vacío.");
        }
    }
}