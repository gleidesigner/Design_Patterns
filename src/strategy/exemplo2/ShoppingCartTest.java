package strategy.exemplo2;

import strategy.exemplo2.payment.PayCreditCard;
import strategy.exemplo2.payment.Paypal;
import strategy.exemplo2.shopping.Item;
import strategy.exemplo2.shopping.ShoppingCart;

/**
 * Created by gleidesilva on 18/08/16.
 * fonte: http://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
 */
public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new Paypal("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new PayCreditCard("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }

}