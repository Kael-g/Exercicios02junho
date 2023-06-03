import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Ex10 {
    //10. Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.
    public static void main(String[] args) {
        Random aleatorio = new Random();
        DecimalFormat df = new DecimalFormat("0.#");
        int[] A = new int[10];


        for (int i = 0; i<10; i++){
            A[i] = aleatorio.nextInt(100);
        }

        System.out.println("Lista de 10 inteiros aleatorios entre 0 e 100: ");
        System.out.println(Arrays.toString(A));
        System.out.println("\nMédia aritimética dos valores ímpares: " + df.format(mediaImpares(A)));
    }

    public static double mediaImpares(int[] lista){
        int impares = 0;
        int soma_impares = 0;
        double media = 0;
        for (int i : lista) {
            if (i % 2 != 0) {
                impares++;
                soma_impares += i;
            }
        }
        if (impares > 0){
            media =  (double) soma_impares / impares;
        }
        return media;
    }
}
