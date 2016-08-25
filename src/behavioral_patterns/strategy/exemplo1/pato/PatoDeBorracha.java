package behavioral_patterns.strategy.exemplo1.pato;

import behavioral_patterns.strategy.exemplo1.voo.VooComum;
import behavioral_patterns.strategy.exemplo1.som.SomBorracha;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class PatoDeBorracha extends Pato {
    public PatoDeBorracha() {
        setSom(new SomBorracha());
        setVoo(new VooComum());
    }
}
