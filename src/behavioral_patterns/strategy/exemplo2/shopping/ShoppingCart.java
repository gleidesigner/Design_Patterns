package behavioral_patterns.strategy.exemplo2.shopping;

import behavioral_patterns.strategy.exemplo2.payment.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class ShoppingCart {

    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem (Item item){
        this.items.add(item);
    }

    public void removeItem (Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for (Item item:items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}

