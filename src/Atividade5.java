import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        int dia = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia da semana: (1-segunda...7=domingo)");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
