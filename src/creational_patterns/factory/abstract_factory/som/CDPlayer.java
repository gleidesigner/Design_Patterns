package creational_patterns.factory.abstract_factory.som;

/**
 * Created by gleides on 27/08/16.
 */
public class CDPlayer extends Som {
    public CDPlayer() {
        System.out.println("Montou Som " + this.getClass().getSimpleName());
    }
}
