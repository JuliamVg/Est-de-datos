import java.util.Random;

public class EM2 {
    public static void main(String[] args) {

        int vector[][] = new int[5][5];
        Random r = new Random();
        int m = vector[0][0];
        int fila = 0; int columna = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                vector[i][j] = r.nextInt(100) + 1;
                System.out.print(vector[i][j] + "\t");

                if (vector[i][j] > m) {
                    m = vector[i][j];
                    fila = i;
                    columna = j;
                    
                }

            }
            System.out.println();
        }

        System.out.println("El numero mayor es : " + m + " en posicion: (" +fila+", "+columna+")" );



        
    }
}
