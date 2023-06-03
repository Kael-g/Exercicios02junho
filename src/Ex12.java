import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex12 {
    //12. Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[20];
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        for (int i = 0; i<20; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            A[i] = input.nextInt();
            if (A[i] % 2 == 0){
                B.add(A[i]);
            } else {
                C.add(A[i]);
            }
        }

        System.out.println("\nLista A com todos os números lidos: ");
        System.out.println(Arrays.toString(A));
        System.out.println("\nLista B com os números pares: ");
        System.out.println(B);
        System.out.println("\nLista C com os números ímpares: ");
        System.out.println(C);
    }
}
