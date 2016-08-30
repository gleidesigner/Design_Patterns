package creational_patterns.factory.abstract_factory.monta_carro;

import creational_patterns.factory.abstract_factory.roda.Roda;
import creational_patterns.factory.abstract_factory.roda.RodaSimples;
import creational_patterns.factory.abstract_factory.som.Som;
import creational_patterns.factory.abstract_factory.som.TocaFitas;

/**
 * Created by gleides on 27/08/16.
 */
public class MontaCarroPopular extends MontaCarroFactory {

    public Roda montaRoda() {
        return new RodaSimples();
    }

    public Som montaSom() {
        return new TocaFitas();
    }
}
