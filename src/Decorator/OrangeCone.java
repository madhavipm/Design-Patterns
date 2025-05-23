package Decorator;

public class OrangeCone implements Icecream {
    //only can used as base object so only default constructor
    public OrangeCone() {

    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "OrangeCone";
    }
}
