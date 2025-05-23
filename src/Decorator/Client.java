package Decorator;

public class Client {
    public static void main(String[] args) {
        Icecream icecream = new Chocochips(
                new StrawberryScoop(
                        new ChocolateCone(
                                new Chocochips(
                                        new OrangeCone()
                                )
                        )
                )
        );
        icecream.getCost();
        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }
}
