import client.Client;
import payment.factory.PaymentFactory;
import payment.factory.PayPalFactory;
import payment.factory.CardFactory;
import payment.factory.BlikFactory;

public class App {
    public static void main(String[] args) {

        Client client = new Client(new PayPalFactory());
        client.processTransaction("12345", 100.0);

        Client client2 = new Client(new CardFactory());
        client2.processTransaction("12345", 100.0);

        Client client3 = new Client(new BlikFactory());
        client3.processTransaction("12345", 100.0);

    }
}