package factory.exemplo2.factory_pessoa;

import factory.exemplo2.pessoa.Homem;
import factory.exemplo2.pessoa.Mulher;
import factory.exemplo2.pessoa.Pessoa;

/**
 * Created by gleidesilva on 23/08/16.
 */
public class FabricaPessoa {
    public Pessoa getPessoa(String nome, String sexo){
        return (sexo.equalsIgnoreCase("M") ? new Homem(nome) : new Mulher(nome));
    }
}
