package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio16 {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Manzana");
        arrayList.add("Banana");
        arrayList.add("Cereza");
        
        if (!arrayList.isEmpty()) {
            String primerElemento = arrayList.get(0);
            System.out.println("El primer elemento del ArrayList es: " + primerElemento);
        } else {
            System.out.println("El ArrayList está vacío.");
        }
    }
}