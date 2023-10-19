
package eva2_10_califas_eua;

import java.util.Scanner;

public class EVA2_10_CALIFAS_EUA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int califa;
        
        System.out.println("Introduzca la calificacion en numero");
        califa = input.nextInt();
        
        if((califa >= 90)&&(califa <= 100))
            System.out.println("A");
        else if ((califa >= 80)&&(califa <= 89))
            System.out.println("B");
        else if ((califa >= 70)&&(califa <= 79))
            System.out.println("C");
        else if ((califa >= 60)&&(califa <= 69))
            System.out.println("D");
        else if ((califa >= 0)&&(califa <= 59))
            System.out.println("F");
        else
            System.out.println("Numero introducido no valido");
    }
    
} 
