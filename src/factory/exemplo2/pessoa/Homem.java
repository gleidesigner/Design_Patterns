package factory.exemplo2.pessoa;

/**
 * Created by gleidesilva on 23/08/16.
 */
public class Homem extends Pessoa {

    public Homem(String nome) {
        this.nome = nome;
        System.out.println("Olá Senhor: "+ this.nome);
    }
}
