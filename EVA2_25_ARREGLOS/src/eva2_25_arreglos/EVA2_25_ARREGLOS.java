
package eva2_25_arreglos;

import java.util.Scanner;

public class EVA2_25_ARREGLOS {

    public static void main(String[] args) {
        
        int cant;
        int[] arregloCali;
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantas calificaciones se van a capturar?");
        cant = input.nextInt();
        
        arregloCali = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificacion: ");
            arregloCali[i] = input.nextInt();
            
        }
        for (int i = 0; i < cant; i++) {
            System.out.print(arregloCali[i] + " - ");
        }
    }
    
}
