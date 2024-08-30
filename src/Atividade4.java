import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome2;
        String senha2;
        System.out.println("Informe o nome: ");
        nome2 = sc.next();
        System.out.println("Informe a senha: ");
        senha2 = sc.next();
        if(nome2.equals("nome") && senha2.equals("123")){
            System.out.println("O nome e a senha estão corretos");
        }else{
            System.out.println("O nome ou a senha estão incorretos");
        }

    }
}
