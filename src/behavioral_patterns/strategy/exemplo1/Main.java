package behavioral_patterns.strategy.exemplo1;


import behavioral_patterns.strategy.exemplo1.pato.Pato;
import behavioral_patterns.strategy.exemplo1.pato.PatoComum;
import behavioral_patterns.strategy.exemplo1.pato.PatoDeBorracha;
import behavioral_patterns.strategy.exemplo1.pato.PatoDeMadeira;
import behavioral_patterns.strategy.exemplo1.som.SomBorracha;
import behavioral_patterns.strategy.exemplo1.voo.VooComum;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class Main {

    public static void main(String [] args){
        Pato patoComum = new PatoComum();
        Pato patoBorracha = new PatoDeBorracha();
        Pato patoMadeira = new PatoDeMadeira();

        patoComum.voo();
        patoComum.som();

        patoBorracha.voo();
        patoBorracha.som();

        patoMadeira.voo();
        patoMadeira.som();

        patoMadeira.setSom(new SomBorracha());
        patoMadeira.setVoo(new VooComum());

        patoMadeira.voo();
        patoMadeira.som();
    }
}
