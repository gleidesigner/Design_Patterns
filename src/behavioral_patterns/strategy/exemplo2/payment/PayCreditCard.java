package behavioral_patterns.strategy.exemplo2.payment;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class PayCreditCard implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public PayCreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paid with credit/debit card = " + amount);
    }
}
