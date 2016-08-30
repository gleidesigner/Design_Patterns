package creational_patterns.factory.factory_method.exemplo2.pessoa;

/**
 * Created by gleides vinente silva on 23/08/16.
 */
public class Homem extends Pessoa {

    public Homem(String nome) {
        this.nome = nome;
        System.out.println("Olá Senhor: "+ this.nome);
    }
}
