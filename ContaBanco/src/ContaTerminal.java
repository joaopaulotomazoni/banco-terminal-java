import  java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da sua conta: ");
        int numeroConta=scanner.nextInt();
        System.out.print("Digite o nome de sua agencia: ");
        scanner.nextLine();
        String agencia= scanner.nextLine();
        System.out.print("Digite seu nome: ");
        String cliente=scanner.nextLine();
        System.out.print("Digite seu saldo: ");
        double saldo= scanner.nextDouble();



        Conta conta = new Conta(numeroConta, agencia, cliente, saldo);

        System.out.print(conta.exibirInformacoes());
    }
}