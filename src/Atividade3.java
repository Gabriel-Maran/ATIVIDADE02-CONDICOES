import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Informe um número que deseja saber se é par ou impar: ");
        num = sc.nextInt();
        if(num%2==0 && num!=0){
            System.out.println("Par");
        }else if(num%2==1){
            System.out.println("Impar");
        }else{
            System.out.println("O número é zero");
        }
    }
}
