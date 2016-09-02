package creational_patterns.factory.factory_method.exemplo2.factory_emissor;

import creational_patterns.factory.factory_method.exemplo2.emissor.Emissor;
/**
 * Created by gleidesilva on 30/08/16.
 */
public class FabricaEmissorAssincrono extends FabricaEmissor {
    @Override
    public Emissor getEmissorMessagem(int tipoEmissor) {
        System.out.println(this.getClass().getSimpleName());
        return super.getEmissorMessagem(tipoEmissor);
    }
}
