
package eva2_9_switch;

import java.util.Scanner;

public class EVA2_9_SWITCH {

    public static void main(String[] args) {
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de mes ");
        mes = input.nextInt();
        
        switch(mes){
            case 1:
                System.out.println("ENERO");
                break;
             case 2:
               System.out.println("FEBRERO");
                break;
             case 3:
               System.out.println("MARZO");
                break;
             case 4:
               System.out.println("ABRIL");
                break;
             case 5:
               System.out.println("MAYO");
                break;
             case 6:
               System.out.println("JUNIO");
                break;
             case 7:
               System.out.println("JULIO");
                break;
             case 8:
               System.out.println("AGOSTO");
                break;
             case 9:
               System.out.println("SEPTIEMBRE");
                break;
             case 10:
               System.out.println("OCTUBRE");
                break;
             case 11:
               System.out.println("NOVIEMBRE");
                 System.out.println("Cumpleaños del profe");
                 System.out.println("y cae en sabado");
                break;
             case 12:
                 System.out.println("DICIEMBRE");
                break;
             default: //Siempre es la ultima instruccion (pero es opcional)
                 System.out.println("El numero de mes no es un mes valido");
        }
    }
    
}
