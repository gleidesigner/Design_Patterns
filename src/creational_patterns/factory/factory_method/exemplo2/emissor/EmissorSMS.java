package creational_patterns.factory.factory_method.exemplo2.emissor;

/**
 * Created by gleides vinente silva on 23/08/16.
 */
public class EmissorSMS implements Emissor {

    @Override
    public void envia(String msg) {
        System.out.println(msg + this.getClass().getSimpleName());
    }
}
