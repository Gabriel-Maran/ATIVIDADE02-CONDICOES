import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        System.out.println("Informe a nota do Aluno(0-10): ");
        nota = sc.nextDouble();
        if (nota > 10 || nota < 0) {
            System.out.println("Digitou algo errado, tente novamente");
        } else if (nota > 9) {
            System.out.println("Nerd demais");
        } else if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else if (nota < 5 && nota >= 0) {
            System.out.println("Insatisfatório");
        }
    }
}
