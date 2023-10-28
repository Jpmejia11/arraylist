package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio12 {
    public static void main(String[] args) {
        
        ArrayList<String> miArrayList = new ArrayList<>();
        miArrayList.add("Elemento 1");
        miArrayList.add("Elemento 2");
        miArrayList.add("Elemento 3");
        
        System.out.println("ArrayList antes de eliminar los elementos: " + miArrayList);
        
        miArrayList.clear();
        
        System.out.println("ArrayList después de eliminar los elementos: " + miArrayList);
    }
}