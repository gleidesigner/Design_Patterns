package creational_patterns.factory.abstract_factory.monta_carro;

import creational_patterns.factory.abstract_factory.som.CDPlayer;
import creational_patterns.factory.abstract_factory.roda.Roda;
import creational_patterns.factory.abstract_factory.roda.RodaLigaLeve;
import creational_patterns.factory.abstract_factory.som.Som;

/**
 * Created by gleides on 27/08/16.
 */
public class MontaCarroLuxo extends MontaCarroFactory {
    public Roda montaRoda() {
        return new RodaLigaLeve();
    }

    public Som montaSom() {
        return new CDPlayer();
    }
}
