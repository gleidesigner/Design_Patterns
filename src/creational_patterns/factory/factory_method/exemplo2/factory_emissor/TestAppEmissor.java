package creational_patterns.factory.factory_method.exemplo2.factory_emissor;

import creational_patterns.factory.factory_method.exemplo2.emissor.Emissor;

/**
 * Created by gleidesilva on 23/08/16.
 */
public class TestAppEmissor {
    public static void main (String [] args){
        FabricaEmissor fabricaEmissorAssincrono = new FabricaEmissorAssincrono();
        Emissor emissorAssincronoEmail = fabricaEmissorAssincrono.getEmissorMessagem(FabricaEmissor.EMAIL);
        emissorAssincronoEmail.envia("Messagem Enviada via:: ");

        Emissor emissorAssincronoSMS = fabricaEmissorAssincrono.getEmissorMessagem(FabricaEmissor.SMS);
        emissorAssincronoSMS.envia("Messagem Enviada via:: ");

        Emissor emissorAssincronoJMS = fabricaEmissorAssincrono.getEmissorMessagem(FabricaEmissor.JMS);
        emissorAssincronoJMS.envia("Messagem Enviada via:: ");

        FabricaEmissor fabricaEmissorSincrono = new FabricaEmissorSincrono();
        Emissor emissorSincronoEmail = fabricaEmissorSincrono.getEmissorMessagem(FabricaEmissor.EMAIL);
        emissorSincronoEmail.envia("\nMessagem Enviada via:: ");

        Emissor emissorSincronoSMS = fabricaEmissorSincrono.getEmissorMessagem(FabricaEmissor.SMS);
        emissorSincronoSMS.envia("Messagem Enviada via:: ");

        Emissor emissorSincronoJMS = fabricaEmissorSincrono.getEmissorMessagem(FabricaEmissor.JMS);
        emissorSincronoJMS.envia("Messagem Enviada via:: ");


        FabricaEmissor fabricaEmissor = new FabricaEmissor();
        Emissor emissorSMS = fabricaEmissor.getEmissorMessagem(FabricaEmissor.SMS);
        emissorSMS.envia("\nMessagem Enviada via:: ");

        Emissor emissorEmail = fabricaEmissor.getEmissorMessagem(FabricaEmissor.EMAIL);
        emissorEmail.envia("Messagem Enviada via:: ");

        Emissor emissorJMS = fabricaEmissor.getEmissorMessagem(FabricaEmissor.JMS);
        emissorJMS.envia("Messagem Enviada via:: ");
    }
}
