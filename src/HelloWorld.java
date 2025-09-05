import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá!");
        System.out.println("Digite o seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite o seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura:");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o seu estado civil:");
        String estadoCivil = scanner.nextLine();

        scanner.close();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu CPF é: " + cpf);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu peso é: " + peso);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu estado civil é: " + estadoCivil);

    }
}
