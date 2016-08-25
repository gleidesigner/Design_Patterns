package creational_patterns.factory.factory_method.exemplo2.factory_pessoa;

import creational_patterns.factory.factory_method.exemplo2.pessoa.Homem;
import creational_patterns.factory.factory_method.exemplo2.pessoa.Pessoa;
import creational_patterns.factory.factory_method.exemplo2.pessoa.Mulher;

/**
 * Created by gleidesilva on 23/08/16.
 */
public class FabricaPessoa {
    public Pessoa getPessoa(String nome, String sexo){
        return (sexo.equalsIgnoreCase("M") ? new Homem(nome) : new Mulher(nome));
    }
}
