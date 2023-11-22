
package eva2_28_arreglos_mdim;

public class EVA2_28_ARREGLOS_MDIM {

    public static void main(String[] args) {
        //arreglo de dos dimensiones: matriz (hoja de excel)
                            //filas,columnas
        int[][] matriz = new int[5][10];
        
        //asignar un valor:
        matriz[1][3] = 100;
        System.out.println("valor en [1][3] = " + matriz[1][3]);
        System.out.println("matriz.lenght = " + matriz.length);
        //matriz.lenght siempre es la primera dimension
        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
