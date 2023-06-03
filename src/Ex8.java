import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex8 {
    //8. Crie um programa para exibir todos os inteiros dentro do intervalo 100-150 cuja soma de todos os dígitos é um número par.
    public static void main(String[] args) {
        List<Integer> soma_par_digitos = new ArrayList<>();
        int centena, dezena, unidade;

        for (int i = 100; i<151; i++){
            centena = (int) i/100;
            dezena = (int) (i%100)/10;
            unidade = (i%100) % 10;
            if ((centena+dezena+unidade) % 2 == 0){
                soma_par_digitos.add(i);
            }
        }

        System.out.println("Números no intervalo entre 100 e 150 cuja soma dos dígitos é um número par:");
        System.out.println(soma_par_digitos);

    }
}
