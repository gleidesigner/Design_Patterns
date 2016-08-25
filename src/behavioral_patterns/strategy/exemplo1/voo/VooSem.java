package behavioral_patterns.strategy.exemplo1.voo;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class VooSem implements CompVoo{
    @Override
    public void compVoo() {
        System.out.println("Não consigo voar");
    }
}
