import java.util.Scanner;

public class Ex6 {
    //6. Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para verificarmos se é múltiplo de 5 e 7: ");
        int numero = input.nextInt();
        System.out.println();

        if (eMultiplo7(numero) && eMultiplo5(numero)){
            System.out.println(numero+ " é múltiplo de 5 e de 7!");
        } else {
            if (eMultiplo5(numero)){
                System.out.println(numero+ " é múltiplo de 5, mas não de 7");
            } else if (eMultiplo7(numero)){
                System.out.println(numero+ " é múltiplo de 7, mas não de 5");
            } else {
                System.out.println(numero+ " não é múltiplo de 7 nem de 5");
            }
        }

    }
    public static boolean eMultiplo5 (int num){
        if (num % 5 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean eMultiplo7 (int num){
        if (num % 7 == 0){
            return true;
        } else {
            return false;
        }
    }
}
