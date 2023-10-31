
package eva2_14_ciclo_for_2;

import java.util.Scanner;

public class EVA2_14_CICLO_FOR_2 {

    public static void main(String[] args) {
        //vamos a capturar calificaciones de un grupo y generar el promedio
        int noCalifas;
        int sumaCalifas = 0; //cero es el neutro aditivo
                             //1 es el neutro multiplicativo
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de calificaciones");
        noCalifas = input.nextInt();
        for (int i = 0; i < noCalifas; i++){
        // tambien funciona for (int i = 1; i <= noCalifas; i++)
            System.out.println("Introduce la calificacion: ");
            int califa = input.nextInt();
            //sumatoria de calificaciones
            //acumuladores
            //sumaCalifas = sumaCalifas + califa;
            sumaCalifas += califa;
        }
        //el promedio es sumaCalifa/noCalifas, pero amos son enteros
        //y dividir entre enteros en java da como resultado un entero
        //el divisor tiene que ser double (noCalifas)
        double promedio = sumaCalifas / (noCalifas * 1.0);
        System.out.println("El promedio es " + promedio);
    }
    
}
