
package eva2_6_and_or_operadores;

import java.util.Scanner;

public class EVA2_6_AND_OR_OPERADORES {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int califa;
        System.out.println("Introduce la calificacion");
        califa = input.nextInt();
        
        //VALIDAR 
        //UNA CALIFA ES MAYOR O IGUAL A 0 --> califa >= 0
        //Y
        //LA CALIFA ES MENOR O IGUAL A 100 --> califa <= 100
        
        if((califa >= 0) && (califa <= 100)){ //valor valido
            System.out.println("La calificacion " + califa + " es valida");
            if(califa >= 70)
                System.out.println("Aprobado");
            else
                System.out.println("No acreditado");
        } 
        else{
            System.out.println("La calificacion " + califa + " no es valida");
        }
        
    }
    
}
