package tallerarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class TallerEjercicio4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(7);
        numeros.add(15);

        Iterator<Integer> iterador = numeros.iterator();

        while (iterador.hasNext()) {
            int numero = iterador.next();
            if (numero % 2 == 0) {
                iterador.remove(); // Elimina el número par
            }
        }

        System.out.println("ArrayList después de eliminar los números pares:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
