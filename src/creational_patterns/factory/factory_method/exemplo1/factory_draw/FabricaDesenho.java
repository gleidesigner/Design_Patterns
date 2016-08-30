package creational_patterns.factory.factory_method.exemplo1.factory_draw;

import creational_patterns.factory.factory_method.exemplo1.shape.*;

/**
 * Created by gleidesilva on 22/08/16.
 */
public class FabricaDesenho {

    // Usar o método getShape para obter objeto de tipo forma

    public Forma getdForma (String TipoForma){
         if(TipoForma == null){
             return null;
         }

        if(TipoForma.equalsIgnoreCase("Circulo")){
            return new Circulo();
        }

        if(TipoForma.equalsIgnoreCase("Retangulo")){
            return new Retangulo();
        }

        if(TipoForma.equalsIgnoreCase("Quadrado")){
            return new Quadrado();
        }

        return null;
    }

}
