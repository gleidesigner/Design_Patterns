package creational_patterns.factory.abstract_factory;

import creational_patterns.factory.abstract_factory.monta_carro.MontaCarroFactory;
import creational_patterns.factory.abstract_factory.monta_carro.MontaCarroLuxo;
import creational_patterns.factory.abstract_factory.monta_carro.MontaCarroPopular;

/**
 * Created by gleides on 27/08/16.
 */
public class TestCarroFactory {

    private static Carro montaCarro(String tipo) {
        MontaCarroFactory montaCarroFactory = null;

        switch (tipo) {
            case "luxo":
                montaCarroFactory = new MontaCarroLuxo();
                break;
            case "popular":
                montaCarroFactory = new MontaCarroPopular();
                break;
        }

        Carro carro = new Carro();
        carro.setRoda(montaCarroFactory.montaRoda());
        carro.setSom(montaCarroFactory.montaSom());

        return carro;
    }

    public static void main(String[] args) {
        System.out.println("Criado o carro de popular");
        Carro popular = montaCarro("popular");
        System.out.println("\nCriado o carro de luxo");
        Carro luxo = montaCarro("luxo");
    }

}
