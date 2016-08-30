package creational_patterns.factory.abstract_factory.roda;

/**
 * Created by gleides on 27/08/16.
 */
public class RodaSimples extends Roda {
    public RodaSimples() {
        System.out.println("montou " + this.getClass().getSimpleName());
    }
}
