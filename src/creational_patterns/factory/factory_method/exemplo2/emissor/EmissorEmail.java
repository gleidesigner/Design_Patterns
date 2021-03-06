package creational_patterns.factory.factory_method.exemplo2.emissor;

/**
 * Created by gleidesilva on 23/08/16.
 */
public class EmissorEmail implements Emissor {

    @Override
    public void envia(String msg) {
        System.out.println(msg + this.getClass().getSimpleName());
    }
}
