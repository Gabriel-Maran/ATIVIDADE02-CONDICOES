import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int idade = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        if (idade > 18) {
            System.out.println("Você tem mais que 18 anos.");
        } else if (idade < 18) {
            System.out.println("Voc~ê tem menos de 18 anos.");
        } else {
            System.out.println("Você tem 18 anos.");
        }
    }

}
