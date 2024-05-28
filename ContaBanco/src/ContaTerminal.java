import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Por favor, insira seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Agora insira seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Perfeito! agora insira sua agência: ");
        String agencia = scanner.next();

        System.out.println("Insira o numero de sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Para finalizar insira o saldo em sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
