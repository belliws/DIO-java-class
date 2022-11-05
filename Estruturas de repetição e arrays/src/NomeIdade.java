import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("Zezinho")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();

        }

        System.out.println("Se chegou aqui deu tudo certo!");
    }
}
