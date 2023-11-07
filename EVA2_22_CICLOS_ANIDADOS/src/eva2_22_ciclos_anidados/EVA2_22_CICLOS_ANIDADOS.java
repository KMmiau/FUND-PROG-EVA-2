
package eva2_22_ciclos_anidados;

import java.util.Scanner;

public class EVA2_22_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        int nume;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        nume = input.nextInt();
        for (int i = nume; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
