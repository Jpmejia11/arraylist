package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio5 {
public static void main(String[] args) {
       
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(7);
        numeros.add(15);

        if (numeros.size() >= 3) {
            
            int tercerElemento = numeros.get(2);
            System.out.println("El tercer elemento de la lista es: " + tercerElemento);
        } else {
            System.out.println("El ArrayList no tiene al menos 3 elementos.");
        }
    }

}
