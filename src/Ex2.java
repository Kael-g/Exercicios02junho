import java.util.*;

public class Ex2 {
//   2. Escreva um programa para inserir um elemento (posição específica) em uma lista.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 10; i<310; i+=10){
            numeros.add(i);
        }

        System.out.println("Lista:\n"+ numeros);

        System.out.print("\nDigite o valor que deseja adicionar à lista: ");
        int num = input.nextInt();
        System.out.print("\nDigite a posição que esse valor deve ser adicionado: ");
        int posicao = input.nextInt();

        if (posicao>=0 && posicao<numeros.size()) {
            numeros.add(posicao, num);
            System.out.println("\nLista atualizada:\n" + numeros);
        } else {
            System.out.println("\nNão foi possível adicionar o valor à posição escolhida.");
        }
    }
}
