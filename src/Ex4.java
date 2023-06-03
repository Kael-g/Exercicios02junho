import java.text.DecimalFormat;
import java.util.*;

public class Ex4 {
    //4. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
    //a. a maior e a menor altura do grupo;
    //b. média de altura dos homens;
    //c. o número de mulheres.
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Random sorteio = new Random();
        String[] sexo = new String[10];
        Double[] altura = new Double[10];
        int aux;

        //gera conjunto de dados de sexo e alturas aleatórios
        for (int i = 0; i<10; i++){
            aux = sorteio.nextInt(2);
            switch (aux){
                case 0:
                    sexo[i] = "masculino";
                    break;
                case 1:
                    sexo[i] = "feminino";
                    break;
                default:
                    sexo[i] = "não especificado";
            }
            aux = sorteio.nextInt(51);
            altura[i] = (double) (aux+140)/100;
        }


        int contador_mulheres, contador_homens;
        contador_mulheres = contador_homens = 0;
        double maior_altura, menor_altura, soma_altura_homens;
        soma_altura_homens = 0;
        maior_altura = menor_altura = altura[0];

        //mostra a tabela e calcula maior altura, menor altura, soma da altura dos homens e número de mulheres

        // %-30s
        System.out.println("Tabela:");
        System.out.printf("%-20s%-20s%-20s\n","ID","Sexo","altura");
        for (int i = 0; i<10; i++){
            System.out.printf("%-20s%-20s%-20s\n",("Pessoa "+(i+1)),sexo[i],(df.format(altura[i]))+"m");

            if (altura[i]>maior_altura){
                maior_altura = altura[i];
            }

            if (altura[i]<menor_altura){
                menor_altura = altura[i];
            }

            if (sexo[i].equalsIgnoreCase("masculino")){
                soma_altura_homens+=altura[i];
                contador_homens++;
            }

            if (sexo[i].equalsIgnoreCase("feminino")){
                contador_mulheres++;
            }
        }

        System.out.println("\n\nMaior altura do grupo: " + df.format(maior_altura)+"m");
        System.out.println("Menor altura do grupo: " + df.format(menor_altura)+"m");
        System.out.println("Média de altura dos homens: " + df.format(soma_altura_homens/contador_homens)+"m");
        System.out.println("Número de mulheres: "+ contador_mulheres);



    }

}
