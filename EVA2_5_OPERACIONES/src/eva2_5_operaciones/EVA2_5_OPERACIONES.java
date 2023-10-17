
package eva2_5_operaciones;

public class EVA2_5_OPERACIONES {

    public static void main(String[] args) {
        int var1, var2, resu;
        
        var1 = 100;
        var2 =200;
        //operador +
        //suma
        //concatenar --> unir cadenas de texto
        resu = var1 + var2;
        
        System.out.println("suma: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 + var2 = " + resu);
        //resta -
        resu = var1 - var2;
        System.out.println(); //salto de linea (enter)
        System.out.println("resta: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 - var2 = " + resu);
        //multiplicacion *
        resu = var1 * var2;
        System.out.println();
        System.out.println("multiplicacion: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 x var2 = " + resu);
        //division /
        //OJO: el tipo de dato es importante, si quieren
        //el resultado de una division, hay que manejarlo flotante
        //si lo manejan entero, los dará el numero de veces que cabe el
        //divsior en el dividendo (de forma entera)
        var1 = 15;
        var2 = 7;
        resu = var1 / var2;
        System.out.println();
        System.out.println("division: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 / var2 = " + resu);
        
        //division flotante
        double resuExacto;
        resuExacto = var1 / var2;
        System.out.println();
        System.out.println("division exacta: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 / var2 = " + resuExacto);
        
        double var2F = 7;
        resuExacto = var1 / var2;
        System.out.println();
        System.out.println("division exacta (¿sera?: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2F = " + var2F);
        System.out.println("var1 / var2F = " + resuExacto);
        
        int cifra = 7;
        double cifraDouble = 7.0;
        
        double division = 100 / 10; //se toma el divisor como entero
        //la interpretacion de double division es distinta si el 10 no tiene .
        //ya que siendo 10.0 se toma como flotante
   
        //Precedencia de operaciones:
        int a = 5, b = 3, c = 2;
        int resultado = (a * b) + (a - c) * (b-a); //(15)+(3)*(-2)//15-6 = 9
        System.out.println("Resultado precedencia: " + resultado);
        
        //potencias y raices:
        double potencia;
        //Math.pow para potencia o raiz poniendo 0.5 1/3.0 etc.
        //Math.sqrt para raiz cuadrada unicamente
        potencia = Math.pow(5, 3);
        System.out.println("Potencia = " + potencia);
    }
    
}
