package creational_patterns.factory.factory_method.exemplo2.factory_emissor;

import creational_patterns.factory.factory_method.exemplo2.emissor.Emissor;
import creational_patterns.factory.factory_method.exemplo2.emissor.EmissorEmail;
import creational_patterns.factory.factory_method.exemplo2.emissor.EmissorJMS;
import creational_patterns.factory.factory_method.exemplo2.emissor.EmissorSMS;

/**
 * Created by gleidesilva on 23/08/16.
 */
public class FabricaEmissor {
    public static final int SMS = 0;
    public static final int EMAIL = 1;
    public static final int JMS = 2;

    public Emissor getEmissorMessagem(int tipoEmissor){
        Emissor emissor = null;

        switch (tipoEmissor){
            case SMS:
                emissor = new EmissorSMS();
                break;
            case EMAIL:
                emissor = new EmissorEmail();
                break;
            case JMS:
                emissor = new EmissorJMS();
                break;
            default:
                throw new IllegalArgumentException("Emissor invalido!!!");
        }
        return emissor;
    }

}
