import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = userInput.next();


        System.out.println("Por favor, digite o número da conta:");
        int numero = userInput.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = userInput.next();


        double saldo = 10.0;

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta  %s e seu saldo %.2f já está disponível para saque",
            nomeCliente, agencia, numero, saldo
        );
        userInput.close();
    }
}
