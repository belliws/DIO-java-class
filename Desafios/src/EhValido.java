import java.util.Scanner;

public class EhValido {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
        
    }

    public static boolean ehValido(String s) {
    
        String parentesis = "()";
        String chaves = "{}";
        String colchetes = "[]";
        String vazio = " ";

        if (s.equals(parentesis)) return true;
        if (s.equals(chaves)) return true;
        if (s.equals(colchetes)) return true;
        if (s.equals(vazio)) return true;
        return false;
    }

}
