public class operadores {
    
    public static void main(String[] args){
        String nomeCompleto = "Antonio" + " Nunes";

        System.out.println(nomeCompleto);
    
            String listaDeCompras = "Nutella," + " farinha," + " açucar";

            System.out.println( listaDeCompras);

                int numero = 5;

                numero = - numero;

                System.out.println(numero);

                System.out.println(-numero);

                    numero = 10;

                    System.out.println(++ numero);

                        boolean variavel = false;

                        System.out.println(!variavel);

                        System.out.println(variavel);

        int a, b;

        a= 6;
        b= 6;

        String resultado = a==b ? "true" : "false";

        System.out.println(resultado);

                a= 20;
                b= 21;

                int result = a==b ? 1 : 0;

                System.out.println(result);

                boolean testeBolean = a==b;
                System.out.println("os valores são iguais? " + testeBolean);

                testeBolean = a!=b;
                System.out.println("os valores são diferentes? " +testeBolean);

                testeBolean = a > b;
                System.out.println("a é maior que b? " +testeBolean);

                    String nomeUm = "Rodrigo";
                    String nomeDois = new String ("Rodrigo");

                    System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
            System.out.print("fim");
    }
}
