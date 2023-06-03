import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    //1. Escreva um programa para remover um elemento específico de uma lista.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 10; i<310; i+=10){
            numeros.add(i);
        }

        System.out.println("Lista:\n"+ numeros);

        System.out.print("\nEscolha um valor da lista para deletar: ");
        int num = input.nextInt();

        if (numeros.contains(num)) {
            numeros.remove((Integer) num);
            System.out.println("\nLista atualizada:\n" + numeros);
        } else {
            System.out.println("\nO valor digitado não foi encontrado");
        }

    }
}
