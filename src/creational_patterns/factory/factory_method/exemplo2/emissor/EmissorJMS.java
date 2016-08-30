package creational_patterns.factory.factory_method.exemplo2.emissor;

/**
 * Created by gleidesilva on 30/08/16.
 */
public class EmissorJMS implements Emissor {

    public EmissorJMS() {
        envia("Messagem Enviada via: ");
    }

    @Override
    public void envia(String msg) {
        System.out.println(msg + this.getClass().getSimpleName());
    }
}
