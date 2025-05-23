package Decorator;

public class VannilaScoop implements Icecream{
    private Icecream icecream;
    public VannilaScoop(Icecream icecream) {
        this.icecream = icecream;
    }
    public VannilaScoop() {

    }

    @Override
    public int getCost() {
        if(icecream!=null){
            return icecream.getCost()+40;
        }
        return 40;
    }

    @Override
    public String getDescription() {
        if(icecream!=null){
            return icecream.getDescription() + " Vannila Scoop";
        }
        return "Vannila Scoop";
    }
}
