import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoConta {
    static void main() {

        Scanner sc = new Scanner(System.in);

        ArrayList<Conta> contas = new ArrayList<>();

        contas.add(new Conta
                ("Tania Mara","taniateste@gmail.com","99966677-7","28/09",15000)
        );
        contas.add(new Conta
                ("Thiago Viana","thiagoteste@gmail.com","99966677-7","28/09",15000)
        );

        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = sc.nextLine();

        Conta ContaEncontrada = null;

        for (Conta nome : contas){
            if (nome.getTitular().equalsIgnoreCase(nomeTitular)) {
                ContaEncontrada = nome;
                break;
            }
        }
        if (ContaEncontrada == null){
            System.out.println("Conta não encontrada");
        }else{

            System.out.println("Olá " +ContaEncontrada.getTitular());

            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar ");
            System.out.println("3 - Exibir saldo atual");
            System.out.println("4 - Exibir dados da conta");

            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("Digite o valor que deseja depositar: ");
                double valor = sc.nextDouble();
                
                ContaEncontrada.deposito(valor);
            } else if (opcao == 2){
                System.out.println("Digite o valor que deseja sacar: ");
                double saque = sc.nextDouble();
                
                ContaEncontrada.saque(saque);
            } else if (opcao == 3){
                System.out.println("Exibindo saldo da conta: ");
                double saldo = sc.nextDouble();
                
                ContaEncontrada.exibirSaldoAtual();
            } else if () {
                
            }
        }


    }
}

//ArrayList<String> nomes = new ArrayList<>();