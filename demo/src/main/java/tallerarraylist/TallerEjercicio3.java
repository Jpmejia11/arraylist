package tallerarraylist;

import java.util.ArrayList;

   
    public class TallerEjercicio3 {
    public static void main(String[ ] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(7);
        numeros.add(15);
        
        int numeroMasGrande = Integer.MIN_VALUE;

       for (int numero : numeros) {
            if (numero > numeroMasGrande) {
                numeroMasGrande = numero;
            }
        }

        System.out.println("El número más grande en la lista es: " + numeroMasGrande);
    }
}