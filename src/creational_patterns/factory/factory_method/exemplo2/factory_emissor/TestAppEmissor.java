package creational_patterns.factory.factory_method.exemplo2.factory_emissor;

import creational_patterns.factory.factory_method.exemplo2.emissor.Emissor;

/**
 * Created by gleidesilva on 23/08/16.
 */
public class TestAppEmissor {
    public static void main (String [] args){
        FabricaEmissor emissorAssincrono = new EmissorAssincrono();
        Emissor emissorA = emissorAssincrono.getEmissorMessagem(FabricaEmissor.SMS);
        emissorA.envia("K19 - Treinamentos");

        FabricaEmissor emissorSincrono = new EmissorSincrono();
        Emissor emissorS = emissorSincrono.getEmissorMessagem(FabricaEmissor.EMAIL);
        emissorA.envia("K19 - Treinamentos");

        FabricaEmissor emissor = new FabricaEmissor();
        Emissor emissorNormal = emissor.getEmissorMessagem(FabricaEmissor.JMS);
        emissorA.envia("K19 - Treinamentos");
    }
}
