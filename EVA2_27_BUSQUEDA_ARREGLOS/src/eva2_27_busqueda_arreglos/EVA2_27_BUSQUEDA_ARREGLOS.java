
package eva2_27_busqueda_arreglos;

import java.util.Scanner;

public class EVA2_27_BUSQUEDA_ARREGLOS {

    public static void main(String[] args) {
        //crear un arreglo de 15 elementos
        //llenarlo con valores aleatorios
        int[] arreglo = new int[15];
        //llenarlo con valores aleatorios entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Que numero buscas?");
        num = input.nextInt();
        //busqueda secuencial (por fuerza bruta)
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == num){//valor encontrado
                System.out.println("valor encontrado en la posicion " + i);
                break;
            }
        }
    }
    
}
