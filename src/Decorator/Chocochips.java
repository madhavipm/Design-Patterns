package Decorator;

public class Chocochips implements Icecream{
    private Icecream icecream;

    public Chocochips(Icecream icecream) {
        this.icecream = icecream;
    }
    //No need of default constructor becuase we don't need
    //the object of chocochip without any base


    @Override
    public int getCost() {
        if(icecream != null){//to avoid npe
            return icecream.getCost() + 5;
        }
        return 0;//// Invalid
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " Chocochips";
    }
}
