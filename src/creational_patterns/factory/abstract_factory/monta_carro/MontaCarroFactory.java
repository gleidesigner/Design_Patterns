package creational_patterns.factory.abstract_factory.monta_carro;

import creational_patterns.factory.abstract_factory.roda.Roda;
import creational_patterns.factory.abstract_factory.som.Som;

/**
 * Created by gleides on 27/08/16.
 */
public abstract class MontaCarroFactory {

    public abstract Roda montaRoda();
    public abstract Som montaSom();
}
