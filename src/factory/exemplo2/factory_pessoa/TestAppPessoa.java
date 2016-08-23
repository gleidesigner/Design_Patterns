package factory.exemplo2.factory_pessoa;

import factory.exemplo2.pessoa.Pessoa;

/**
 * Created by gleidesilva on 23/08/16.
 */
public class TestAppPessoa {
    public static void main (String [] args){
        FabricaPessoa fabricaPessoa = new FabricaPessoa();
        Pessoa homem = fabricaPessoa.getPessoa("Carlos", "M");
        Pessoa mulher = fabricaPessoa.getPessoa("Maria", "F");

        System.out.println(homem.nome);
    }
}
