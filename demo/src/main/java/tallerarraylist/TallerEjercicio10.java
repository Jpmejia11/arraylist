package tallerarraylist;

import java.util.ArrayList;

public class TallerEjercicio10 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(7);
        numeros.add(15);

        System.out.println("Números en el ArrayList:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}