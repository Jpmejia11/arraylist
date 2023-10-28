package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio13 {
    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Luis");
        
        nombres.add(1, "Pedro");
        
        System.out.println("ArrayList después de agregar 'Pedro': " + nombres);
    }
}