import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        double n1 = 0;
        double n2 = 0;
        int escolha = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor 1");
        n1 = sc.nextDouble();
        System.out.println("Digite o valor 2: ");
        n2 = sc.nextDouble();
        System.out.println("Digite '1' se deseja somar, '2' se deseja subtrair, '3' se deseja multiplicar e '4' se deseja dividir: ");
        escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("A soma de " + n1 + " com " + n2 + " é igual a " + (n1 + n2));
                break;
            case 2:
                System.out.println("A subtraçãp de " + n1 + " com " + n2 + " é igual a " + (n1 - n2));
                break;
            case 3:
                System.out.println("A multiplicação de " + n1 + " com " + n2 + " é igual a " + (n1 * n2));
                break;
            case 4:
                System.out.println("A divisão de " + n1 + " com " + n2 + " é igual a " + (n1 / n2));
                break;
            default:
                System.out.println("Escolha de operação inválida");
                break;

        }
    }
}
