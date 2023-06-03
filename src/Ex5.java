import java.text.DecimalFormat;
import java.util.*;
import java.util.function.DoubleFunction;

public class Ex5 {
    //5. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner input = new Scanner(System.in);
        Map<String,Double> salarios = new HashMap<>();
        String nome;
        double salario;
        System.out.print("Quantos funcionários há na empresa? ");
        int qte_funcionarios = input.nextInt();
        for (int i = 0; i<qte_funcionarios; i++){
            System.out.printf("Digite o nome do %dº funcionário: ",i+1);
            nome = leia();
            System.out.printf("Digite o salário de %s: ",nome);
            salario = validaPositivos();
            salarios.put(nome,salario);
        }

        System.out.printf("\nMédia salarial: R$ %s", df.format(mediaValoresMap(salarios)));

    }

    public static double validaPositivos(){
        Scanner input = new Scanner(System.in);
        double num;
        for (num = input.nextDouble(); num<0; num = input.nextDouble()){
            System.out.print("Valor não pode ser menor que 0. Por favor, digite um valor válido: ");
        }
        return num;
    }
    public static String leia(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static double mediaValoresMap(Map<String,Double> dicionario){
        double soma = 0;
        for(double s : dicionario.values()){
            soma+=s;
        }
        return (soma/dicionario.size());
    }
}
