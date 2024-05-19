import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner terminal = new Scanner(System.in);
        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta: ");
        // Obter pela scanner os valores digitados no terminal
        int numero = terminal.nextInt();

        terminal.nextLine();

        System.out.println("Por favor, digite o codigo da Agência: ");
        String agencia = terminal.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nome = terminal.nextLine();

        System.out.println("Qual o seu saldo? ");
        double saldo = terminal.nextDouble();

        // Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nome, agencia, numero, saldo);
    }
}
