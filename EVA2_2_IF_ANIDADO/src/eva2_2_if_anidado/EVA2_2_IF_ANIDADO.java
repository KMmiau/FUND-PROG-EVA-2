
package eva2_2_if_anidado;

import java.util.Scanner;

public class EVA2_2_IF_ANIDADO {

    public static void main(String[] args) {
    int valor1;
    int valor2;
    Scanner input = new Scanner(System.in);
    
        System.out.println("Valor 1: ");
        valor1 =input.nextInt();
        System.out.println("valor 2: ");
        valor2 = input.nextInt();
        
        if(valor1 > valor2) //verdad  //concatenar
            System.out.println("El valor mas grande es " + valor1);
        else{ //falso, el valor1 no es mas grande que el valor2
            //if anidado: un if dentro de otro if
            // un = es asignacion
            // == es comparacion o igualdad
            if(valor1 == valor2) //verdad
                System.out.println("Ambos valores son iguales");
            else
                System.out.println("El valor mas pequeño es " + valor1);
                
        }
    }
    
}
