package Decorator;

public class ChocolateCone implements Icecream{
    private Icecream icecream;

    public ChocolateCone(Icecream icecream) {
        this.icecream = icecream;
    }

    public ChocolateCone() {
        //this can act as base aswell as toppings so default is for obj creation
        //copy constructor is for using existing one

    }

    @Override
    public int getCost() {
        if (icecream != null) {
            return icecream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if (icecream != null) {
            return icecream.getDescription() + " ChocolateCone";
        }
        return "ChocolateCone";
    }
}
