package behavioral_patterns.strategy.exemplo1.pato;

import behavioral_patterns.strategy.exemplo1.som.SomComum;
import behavioral_patterns.strategy.exemplo1.voo.VooComum;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class PatoComum extends Pato {
    public PatoComum() {
        setSom(new SomComum());
        setVoo(new VooComum());
    }
}
