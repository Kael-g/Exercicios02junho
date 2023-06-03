import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] numeros = new int[4][5];
        int soma = 0;

        System.out.println("Matriz com valores aleatórios entre 0 e 100: ");
        for (int i = 0; i<numeros.length; i++){
            for (int j = 0; j< numeros[i].length; j++){
                numeros[i][j] = (int) Math.round(aleatorio.nextDouble()*100);
                System.out.printf("%6s", numeros[i][j]);
                soma += numeros[i][j];
            }
            System.out.println();
        }

        System.out.println("\nSoma dos números da tabela:  " + soma);

    }
}
