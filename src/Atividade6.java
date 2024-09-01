import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        double media_final = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a media final do aluno: (1-10)");
        media_final = sc.nextDouble();
        if (media_final > 10 || media_final < 0) {
            System.out.println("Erro, parece que você digitou a media de forma errada.");
        } else if (media_final >= 7 && media_final <= 10) {
            System.out.println("Aprovado!");
        } else if (media_final >= 5 && media_final < 7) {
            System.out.println("Recuperação.");
        } else if (media_final < 5 && media_final >= 0) {
            System.out.println("Reprovado.");
        }
    }
}
