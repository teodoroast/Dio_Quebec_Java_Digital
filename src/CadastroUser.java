import java.util.Locale;
import java.util.Scanner;

public class CadastroUser {
    public static void main(String[] args) {
        System.out.println("CADASTRO DE USUÁRIO");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        String idade = scanner.next();

        System.out.println("Digite seu E-mail");
        String email = scanner.next();

        // Imprimindo os dados obtidos pelo usuário
        //System.out.println("Olá, me chamo " + nome + " " + sobrenome); //Linha simplificada letras minusculas
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase()); //Minusculas para Maiusculas
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("E-mail de contato: " + email);
        scanner.close();
    }
}
