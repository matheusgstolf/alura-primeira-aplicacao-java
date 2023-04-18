import java.util.Scanner;

public class DesafioAula04 {
    public static void main(String[] args) {
        String nome = "Cliente Teste";
        String tipoConta = "Corrente";
        double saldo = 0;
        Scanner leitura = new Scanner(System.in);
        int operador;
        double leitorValor;
        boolean exit = false;
        String mensagemInicial = "";

        while (!exit) {
            mensagemInicial = """
                    *****************************************************
                    Dados iniciais do cliente:
                    
                    Nome:           %s
                    Tipo conta:     %s
                    Saldo inicial:  %.2f
                    ******************************************************
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """.formatted(nome, tipoConta, saldo);
            System.out.println(mensagemInicial);
            operador = leitura.nextInt();

            switch(operador) {
                case 1:
                    System.out.println("Seu saldo é de: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a depositar: ");
                    leitorValor = leitura.nextDouble();
                    saldo += leitorValor;
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir: ");
                    leitorValor = leitura.nextDouble();
                    if (saldo >= leitorValor) {
                        saldo -= leitorValor;
                    } else {
                        System.out.println("Você não possui saldo para realizar esta operação");
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Operação não encontrada, informe novamente");
                    break;
            }
        }
    }
}
