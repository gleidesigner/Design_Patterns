package creational_patterns.factory.abstract_factory;

import creational_patterns.factory.abstract_factory.roda.Roda;
import creational_patterns.factory.abstract_factory.som.Som;

/**
 * Created by gleides on 27/08/16.
 */
public class Carro {
    public Roda roda;
    public Som som;

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public void setSom(Som som) {
        this.som = som;
    }
}
