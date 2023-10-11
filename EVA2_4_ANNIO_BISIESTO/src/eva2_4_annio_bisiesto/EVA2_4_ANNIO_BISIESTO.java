
package eva2_4_annio_bisiesto;

import java.util.Scanner;

public class EVA2_4_ANNIO_BISIESTO {

    public static void main(String[] args) {
    int year, residuo;
    
    Scanner input = new Scanner(System.in);
        System.out.println("introduce el año: ");
        year = input.nextInt();
        //verificar divisible entre 4
        residuo = year % 4;
        
        if(residuo == 0){
            residuo = year % 100;
            if(residuo > 0)
                System.out.println("es año bisiesto");
            else{
                residuo = year % 400;
                if(residuo == 0)
                    System.out.println("es año bisiesto");
                else
                    System.out.println("no es año bisiesto");
        }
        }
        else
            System.out.println("el año no es bisiesto");
        
    
}
}