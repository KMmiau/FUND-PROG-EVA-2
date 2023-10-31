
package eva2_13_ciclo_for;

public class EVA2_13_CICLO_FOR {

    public static void main(String[] args) {
        //++ (+1) --(-1) += -= *= (en lugar de 1 es n)
        //for --> desde
        //mientras sea verdad la condicion el for se ejecuta
        //cuando es falso termina
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //la i no existe fuera del bloque de codigo de cada for
        System.out.println("-----------------------");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        //imprimir los numeros pares de 0 a 100 incluyendo 0 y 100
        for (int i = 0; i < 101; i+= 2) {
            System.out.print(i + " - ");
        }
    }
    
}
