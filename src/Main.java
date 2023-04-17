public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String filme = "TopGun: Maverick";
        String sinopse;
        sinopse = """
                    Filme: %s,
                    Média de avaliação: %.2f
                    Filme de ação, muito bom que revoltou a pessoas sem motivo.
                  """.formatted(filme, media);
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}