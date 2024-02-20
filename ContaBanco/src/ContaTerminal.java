import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Por favor digite o número da Agência: ");
            String agencia = sc.next();

            System.out.println("Por favor digite o número da conta corrente:  ");
            int conta = sc.nextInt();

            System.out.println("Por favor digite o nome do cliente:  ");
            String nome = sc.next();

            System.out.println("Por favor digite o saldo:  ");
            Double saldo = sc.nextDouble();

            System.out.printf("""
                    Olá %s, obrigado por criar uma conta em nosso banco, sua
                    Agência é %s, conta %d e seu saldo %.2f, já esta disponível para saque.
                    """, nome, agencia, conta, saldo);
            sc.close();
        }

    }

}
