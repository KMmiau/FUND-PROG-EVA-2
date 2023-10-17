
package eva2_7_leap_year;

import java.util.Scanner;

public class EVA2_7_LEAP_YEAR {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int year, resi4, resi100, resi400;
        System.out.println("introduce el año: ");
        year = input.nextInt();
        
        resi4 = year % 4; //residuo de dividir el año entre 4
        resi100 = year % 100; //residuo de dividir el año entre 100
        resi400 = year % 400; //residuo de dividir el año entre 400
        
        if((resi4 == 0) && ((resi100 != 0) || (resi400 == 0)))
            System.out.println("El año " + year + " es bisiesto");
        else
            System.out.println("El año " + year + " NO es bisiesto");
    }
    
}
