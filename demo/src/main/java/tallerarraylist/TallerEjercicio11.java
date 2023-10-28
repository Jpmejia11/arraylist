package tallerarraylist;

import java.util.ArrayList;
import java.util.List;

public class TallerEjercicio11 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        
        List<Integer> numerosDuplicados = new ArrayList<>();
        
        for (int numero : numeros) {
            numerosDuplicados.add(numero * 2);
        }
        
        System.out.println("ArrayList original: " + numeros);
        
        System.out.println("ArrayList con elementos duplicados: " + numerosDuplicados);
    }
}