package Observer;

public class InvoiceGenerator implements Observer {
    private Observer observer;

    public InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerObserver(this);
    }
    @Override
    public void annouceOrderPlaced() {
        System.out.println("Generating Invoice...");
    }
}
