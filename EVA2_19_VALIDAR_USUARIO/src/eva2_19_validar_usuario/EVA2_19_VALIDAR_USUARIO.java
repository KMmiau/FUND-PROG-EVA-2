
package eva2_19_validar_usuario;

import java.util.Scanner;

public class EVA2_19_VALIDAR_USUARIO {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";
    //final es para hacer constantes, static es para hacerlo compatible con otros static
    public static void main(String[] args) {
        
        String usuario, password;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("introduce el usuario");
            usuario = input.nextLine();
            System.out.println("Introduce la contraseña");
            password = input.nextLine();
        }while(!usuario.equals(NOMBRE_USUARIO) || !password.equals(PASSWORD));
        // es or (||) porque solo uno tiene que estar mal para repetir
        System.out.println("Acceso concedido. Bienvenido!");
    }
    
}
