import java.util.*;

public class Ex11 {
//    11. Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] idades = new int[10];

        System.out.print("Digite a 1ª idade: ");
        int menor, maior, menor_index, maior_index;
        menor = maior = idades[0] = input.nextInt();
        menor_index = maior_index = 0;
        for (int i = 1; i<10; i++){
            System.out.printf("Digite a %dª idade: ",i+1);
            idades[i] = input.nextInt();
        }

        for (int i=1; i<10; i++){
            if (idades[i]>maior){
                maior = idades[i];
                maior_index = i;
            }
            if (idades[i]<menor){
                menor = idades[i];
                menor_index = i;
            }
        }
        System.out.println("Maior idade: "+ maior + "    Posição: "+maior_index);
        System.out.println("Menor idade: "+ menor + "    Posição: "+menor_index);
    }
}
