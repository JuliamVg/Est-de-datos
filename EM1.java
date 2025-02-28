import java.util.Random;

public class EM1{ 
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        int suma = 0;
        Random rand = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = rand.nextInt(100) + 1; 
                suma += matriz[i][j];
                System.out.print(matriz[i][j] + "\t");

            }
            System.out.println();
        }
                
        System.out.println("\nLa suma de los elementos de la matriz es: " + suma);
    }
}
