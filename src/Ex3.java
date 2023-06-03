import java.util.*;

public class Ex3 {
    //3. Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Double> numeros = new TreeSet<>();

        for (int i = 0; i<2; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            numeros.add(input.nextDouble());
        }

        List<Double> lista_numeros = new ArrayList<>(numeros);

        System.out.println("\nNúmeros em ordem decrescente:");
        for (int i = lista_numeros.size()-1; i>=0;i--){
            System.out.print(lista_numeros.get(i)+"   ");
        }

    }
}
