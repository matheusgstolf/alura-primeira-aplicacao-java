import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento: ");
        int ano = leitura.nextInt();
        System.out.println("Digite a avaliação sobre o filme");
        double avaliacao = leitura.nextDouble();

        String details = """
                    Filme: %s
                    Ano de Lançamento: %d
                    Avaliação: %.2f
                """.formatted(filme,ano,avaliacao);
        System.out.println(details);
    }
}
