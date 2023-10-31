
package eva2_16_cajero;

import java.util.Scanner;

public class EVA2_16_CAJERO {

    public static void main(String[] args) {
        int cuenta = 1000;
        int retiro = 0;
        
        Scanner input = new Scanner(System.in);
        
        while(cuenta > 0){
            System.out.println("Cuanto quieres retirar?");
            retiro = input.nextInt();
            cuenta -= retiro;
            System.out.println("Tu saldo es: " + cuenta);
        }
    }
    
}
