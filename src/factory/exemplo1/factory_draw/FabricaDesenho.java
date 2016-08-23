package factory.exemplo1.factory_draw;

import factory.exemplo1.shape.Circulo;
import factory.exemplo1.shape.Forma;
import factory.exemplo1.shape.Quadrado;
import factory.exemplo1.shape.Retangulo;

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
