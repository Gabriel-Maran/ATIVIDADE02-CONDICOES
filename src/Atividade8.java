import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Double temp_c = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Celcius");
        temp_c = sc.nextDouble();
        if (temp_c > 30) {
            System.out.println("Quente");
        } else if (temp_c <= 30 && temp_c >= 15) {
            System.out.println("Agradável");
        } else {
            System.out.println("Frio");
        }
    }
}
