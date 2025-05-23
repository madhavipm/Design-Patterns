package Decorator;

public class StrawberryScoop implements Icecream{
    private Icecream icecream;
    public StrawberryScoop(Icecream icecream) {
        this.icecream = icecream;
    }
    public StrawberryScoop() {

    }

    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(icecream!=null){
            return icecream.getDescription() +  " Strawberryscoop";
        }
        return "StrawberryScoop";
    }
}
