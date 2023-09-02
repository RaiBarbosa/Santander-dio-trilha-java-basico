import java.util.Locale;
import java.util.Scanner;


public class App {
public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite a sua ag\u00EAncia ");
        String agencia = scanner.next();

        System.out.println("Digite a sua conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ol\u00E1, " + nome + ". Obrigado por criar uma conta em nosso banco. A sua ag\u00EAncia \u00E9 " + agencia + ", conta " + conta + " e seu saldo " +saldo+ " j\u00E1 est\u00E1 dispon\u00EDvel para saque.");



        
        
        
    }
}




