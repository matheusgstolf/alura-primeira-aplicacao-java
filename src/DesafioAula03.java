import java.util.Random;
import java.util.Scanner;

//   Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:
//
//   Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
//
//   Dicas:
//
//   Para gerar um número aleatório em Java: new Random().nextInt(100);
//   Utilize o Scanner para obter os dados do usuário;
//   Utilize uma variável para contar as tentativas;
//   Utilize um loop para controlar as tentativas;
//   Utilize a instrução break; para interromper o loop.
public class DesafioAula03 {
    public static void main(String[] args) {
        int key = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int number;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite seu palpite: ");
            number = leitura.nextInt();

            if (number > key) {
                System.out.println("O número informado é maior que a chave");
            } else if (number < key) {
                System.out.println("O número informado é menor que a chave");
            } else {
                System.out.println("Acertou!");
            }
        }
    }
}
