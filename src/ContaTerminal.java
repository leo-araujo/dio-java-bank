import java.util.Scanner;

public class ContaTerminal {

    String nomeCliente;
    int numero;
    String agencia;
    double saldo;

    public static void main(String[] args) throws Exception {
        ContaTerminal contaCliente = new ContaTerminal();
        contaCliente.consultaSaldo();
    }

    public void consultaSaldo(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = userInput.next();


        System.out.println("Por favor, digite o número da conta:");
        numero = userInput.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        agencia = userInput.next();


        saldo = 10.0;

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta  %s e seu saldo %.2f já está disponível para saque",
            nomeCliente, agencia, numero, saldo
        );
        userInput.close();
    }
}
