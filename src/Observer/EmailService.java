package Observer;

public class EmailService implements Observer {

    public EmailService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerObserver(this);
    }
    @Override
    public void annouceOrderPlaced() {
        System.out.println("Sending the order email");
    }
}
