package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio19 {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Manzana");
        arrayList.add("Banana");
        arrayList.add("Cereza");
        
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, "Hola");
        }
        
        System.out.println("ArrayList después de cambiar los elementos: " + arrayList);
    }
}