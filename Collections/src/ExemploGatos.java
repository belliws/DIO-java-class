import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploGatos {
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato( "Jon", 18, "preto"));
            add(new Gato("Simba", 6,"tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
            
        }};
        System.out.println(meusGatos);

        System.out.println("Ordem de inserção: ");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural (nome): ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural (idade): ");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem natural (cor): ");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem natural (cor; nome; idade): ");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

  
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getnome(){
        return nome;
    }

    public Integer getidade(){
        return idade;
    }

    public String getcor(){
        return cor;
    }

    @Override
    public String toString(){
        return "Gato{" + "nome'" + nome + '\'' + ", idade=" + idade + ", cor='" + cor + '\'' + '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getnome().compareToIgnoreCase(gato.getnome());
    }

}

class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1,Gato g2){
        return Integer.compare(g1.getidade(), g2.getidade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1,Gato g2){
        return g1.getcor().compareToIgnoreCase(g2.getcor());
    }
}

class ComparatorNomeCorIdade implements Comparator <Gato>{

    @Override
    public int compare(Gato g1, Gato g2){
        int nome = g1.getnome().compareToIgnoreCase(g2.getnome());
        if(nome != 0) return nome;

        int cor = g1.getcor().compareToIgnoreCase(g2.getcor());
        if(cor!= 0) return cor;

        return Integer.compare(g1.getidade(), g2.getidade());
    }
}