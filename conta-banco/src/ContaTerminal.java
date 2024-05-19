import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        //TO DO: conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados pelo usuário
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número do seu banco:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da sua Agência:");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
