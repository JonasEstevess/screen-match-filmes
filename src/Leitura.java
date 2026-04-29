import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme =  leitura.nextLine();

        System.out.println("Em que ano esse filme lançou?: ");
        int ano = leitura.nextInt();

        System.out.println("De 0 a 10 que avaliação você daria para este filme?: ");
        double avaliacao = leitura.nextDouble();


        System.out.println("Seu filme favorito é o glorioso " + filme);
        System.out.println("Lançado no ano de " + ano);
        System.out.println("E a sua nota para com esse file foi " + avaliacao);

    }
}
