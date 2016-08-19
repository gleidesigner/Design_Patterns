package strategy.exemplo1.pato;

import strategy.exemplo1.som.SomBorracha;
import strategy.exemplo1.voo.VooComum;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class PatoDeBorracha extends Pato {
    public PatoDeBorracha() {
        setSom(new SomBorracha());
        setVoo(new VooComum());
    }
}
