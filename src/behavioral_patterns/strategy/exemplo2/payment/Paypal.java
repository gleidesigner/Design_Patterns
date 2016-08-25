package behavioral_patterns.strategy.exemplo2.payment;

/**
 * Created by gleidesilva on 18/08/16.
 */
public class Paypal implements PaymentStrategy {

    private String emailId;
    private String password;

    public Paypal(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("paid using Paypal = " + amount);
    }
}
