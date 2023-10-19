
package eva2_11_tallas;

import java.util.Scanner;

public class EVA2_11_TALLAS {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int talla;
        
        System.out.println("Introduce la talla en valor numerico");
        talla = input.nextInt();
        
        switch(talla){
        case(29):
            System.out.println("Talla small");
            break;
        case(42):
            System.out.println("Talla medium");
            break;
        case(44):
            System.out.println("Talla large");
            break;
        case(48):
            System.out.println("Talla xlarge");
            break;
        default:
            System.out.println("Valor no valido");
    }
    
}
}
