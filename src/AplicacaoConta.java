import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoConta {
    static void main() {

        Scanner sc = new Scanner(System.in);

        ArrayList<Conta> contas = new ArrayList<>();

        contas.add(new Conta
                ("Tania Mara", "taniateste@gmail.com", "70218761651", "28/09/2026", 15000)
        );
        contas.add(new Conta
                ("Thiago Viana", "thiagoteste@gmail.com", "14498234677", "28/09/2026", 15000)
        );

        System.out.println("Digite o CPF da conta titular, sem pontos ou traços: ");
        String cpfTitular = sc.nextLine();

        Conta ContaEncontrada = null;

        for (Conta cpf : contas) {
            if (cpf.getCpf().equalsIgnoreCase(cpfTitular)) {
                ContaEncontrada = cpf;
                break;
            }
        }
        if (ContaEncontrada == null) {
            System.out.println("Conta não encontrada");
        } else {

            System.out.println("Olá " + ContaEncontrada.getTitular());

            int opcao = 0;

            while (opcao != 5) {
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar ");
                System.out.println("3 - Exibir saldo atual");
                System.out.println("4 - Exibir dados da conta");
                System.out.println("5 - Sair");

                System.out.println("Escolha uma opção: ");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.println("Digite o valor que deseja depositar: ");
                    double valor = sc.nextDouble();

                    ContaEncontrada.deposito(valor);
                } else if (opcao == 2) {
                    System.out.println("Digite o valor que deseja sacar: ");
                    double saque = sc.nextDouble();

                    ContaEncontrada.saque(saque);
                } else if (opcao == 3) {
                    ContaEncontrada.exibirSaldoAtual();

                } else if (opcao == 4) {
                    System.out.println("Exibindo os dados da conta: ");

                    ContaEncontrada.exibirDado();
                }else if (opcao == 5){
                    System.out.println("Saindo....");

                } else {
                    System.out.println("Opção invalida");
                }
            }
            sc.close();
        }
    }
}