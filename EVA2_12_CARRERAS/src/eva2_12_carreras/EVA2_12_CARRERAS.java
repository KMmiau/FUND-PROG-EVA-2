
package eva2_12_carreras;

import java.util.Scanner;

public class EVA2_12_CARRERAS {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String carrera;
        System.out.println("Introducir las siglas de la carrera en mayusculas");
        System.out.println("ISC, INF, IND, IDI, LA, IGE, ARQ");
        carrera = input.nextLine();
        
        if(carrera == "ISC")
            System.out.println("Ingenieria en sistemas computacionales");
            else if(carrera == "INF")
            System.out.println("Ingenieria en informatica");
            else if(carrera == "IND")
                System.out.println("Ingenieria industrial");
            else if(carrera == "IDI")
                System.out.println("Ingenieria en diseño industrial");
            else if(carrera == "LA")
                System.out.println("Licenciatura en administracion");
            else if(carrera == "IGE")
                System.out.println("Ingenieria en gestion empresarial");
            else if(carrera == "ARQ")
                System.out.println("Arquitectura");
            else
                System.out.println("error");
                
                   
    }
    
}
