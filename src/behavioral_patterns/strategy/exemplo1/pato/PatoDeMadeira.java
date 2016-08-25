package behavioral_patterns.strategy.exemplo1.pato;

import behavioral_patterns.strategy.exemplo1.som.SomMudo;
import behavioral_patterns.strategy.exemplo1.voo.VooSem;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class PatoDeMadeira extends Pato {
    public PatoDeMadeira() {
        setSom(new SomMudo());
        setVoo(new VooSem());
    }
}
