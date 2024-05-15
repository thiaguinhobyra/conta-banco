import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite a conta: ");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.println("Digite o saldo do cliente: ");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque");

    }
}
