import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        double sal_bruto = 0.0;
        double anos_trab = 0.0;
        double porc_incluida = 0.0;
        double imp_desc = 0.0;
        double sal_liq = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário bruto do funcionário: (Ex:1999,99)");
        sal_bruto = sc.nextDouble();
        System.out.println("Digite a quantidade de anos que este funcionário trabalha na empresa (Ex:4,5)");
        anos_trab = sc.nextDouble();
        if (anos_trab > 10) {
            porc_incluida = 0.1;
        } else if (anos_trab >= 5) {
            porc_incluida = 0.05;
        }
        if (sal_bruto > 5000) {
            imp_desc = 0.27;
        } else if (sal_bruto >= 3000) {
            imp_desc = 0.18;
        } else {
            imp_desc = 0.1;
        }
        sal_liq = sal_bruto + (sal_bruto * porc_incluida) - (sal_bruto * imp_desc);
        System.out.println("O salário bruto é R$" + sal_bruto + " o bônus recebido foi de " + porc_incluida * 100 + "%, o imposto descontado foi de " + imp_desc * 100 + "%");
        System.out.println("O salário líquido é de R$" + sal_liq);
    }
}
