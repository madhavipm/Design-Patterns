package Observer;

public class InventoryService implements Observer {
    private Observer observer;
    public InventoryService() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerObserver(this);
    }
    @Override
    public void annouceOrderPlaced() {
        System.out.println("Notifying InventoryService");
    }
}
