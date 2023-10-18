
package eva2_8_else_if;

import java.util.Scanner;

public class EVA2_8_ELSE_IF {

    public static void main(String[] args) {
    //capturar el mes en formato numerico (entero)
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de mes ");
        mes = input.nextInt();
        
        //if((mes >= 1) && (mes <= 12)){ //if((mes > 0) && (mes < 13))
            if(mes == 1)
                System.out.println("ENERO");
            else if(mes == 2)
                System.out.println("FEBRERO");
            else if(mes == 3)
                System.out.println("MARZO");
            else if(mes == 4)
                System.out.println("ABRIL");
            else if(mes == 5)
                System.out.println("MAYO");
            else if(mes == 6)
                System.out.println("JUNIO");
            else if(mes == 7)
                System.out.println("JULIO");
            else if(mes == 8)
                System.out.println("AGOSTO");
            else if(mes == 9)
                System.out.println("SEPTIEMBRE");
            else if(mes == 10)
                System.out.println("OCTUBRE");
            else if(mes == 11)
                System.out.println("NOVIEMBRE");
            else if(mes == 12)
                System.out.println("DICIEMBRE");
            else
                System.out.println("El numero no es un mes valido");
        //}
        
        
    }
    
}
