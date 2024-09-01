import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        double valor = 0.0;
        double valor_desconto = 0.0;
        double porc_desconto = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor total da compra: ");
        valor = sc.nextDouble();
        if (valor > 500) {
            porc_desconto = 20;
            valor_desconto = valor * 0.2;
        } else if (valor >= 200) {
            porc_desconto = 10;
            valor_desconto = valor * 0.1;
        } else if (valor >= 100) {
            porc_desconto = 5;
            valor_desconto = valor * 0.05;
        }  else if(valor < 100) {
            porc_desconto = 0;
            valor_desconto = 0;
        }
        System.out.println("O valor da compra foi de R$"+valor+", foi aplicado "+porc_desconto+"% de desconto, sendo R$"+valor_desconto+" de desconto");
        System.out.println("O valor final foi de R$"+(valor-valor_desconto));
    }
}
