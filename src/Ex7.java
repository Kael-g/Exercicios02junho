import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7 {
    //7. Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite uma sequencia de valores inteiros (-1 para sair): ");
        int num = input.nextInt();
        while (num != -1){
            numeros.add(num);
            num = input.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa (do último inserido ao primeiro): ");
        for (int i = numeros.size()-1; i>=0; i--){
            System.out.printf("%-5s", numeros.get(i));
        }
        System.out.println();

    }
}
