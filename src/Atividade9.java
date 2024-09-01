import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        double num = 0.0;
        Scanner sc = new Scanner(System.in);;
        System.out.println("Digite um número que deseja saber se é postivio, negativo ou zero: ");
        num = sc.nextDouble();
        if(num>0){
            System.out.println("Número positivo");
        } else if(num<0){
            System.out.println("Número negativo");
        } else{
            System.out.println("Número neutro, ou seja, zero");
        }
    }
}
