
package eva2_23_arreglos;

public class EVA2_23_ARREGLOS {

    public static void main(String[] args) {
        //declarar el arreglo = creacion del arreglo
        int[] arreglo = new int[10];
        //como se usa, el acceso es por indices
        //el primer elemento del arreglo esta en la posicion 0 (cero)
        //ultimo elemento es N - 1, N es el tamaño del arreglo
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        System.out.println(arreglo[0]);
        ///
        String[] arregloCade = new String[5];
        arregloCade[0] = "hola";
        arregloCade[1] = "";
        arregloCade[2] = "Mundo";
        arregloCade[3] = "";
        arregloCade[4] = "Cruel!!!";
        
        System.out.println(arregloCade[0]);
        System.out.println(arregloCade[1]);
        System.out.println(arregloCade[2]);
        System.out.println(arregloCade[3]);
        System.out.println(arregloCade[4]);
    }
    
}
