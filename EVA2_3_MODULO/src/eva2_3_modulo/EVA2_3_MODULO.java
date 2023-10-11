
package eva2_3_modulo;

import java.util.Scanner;

public class EVA2_3_MODULO {

    public static void main(String[] args) {
    int valor, residuo;
    Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor a evaluar");
    valor = input.nextInt();
    
    residuo = valor % 2; // % modulo --> residuo
    
    if(residuo == 0) //valor es par
            System.out.println("El valor es par");
    else
            System.out.println("El valor es impar");
    }
    
}
