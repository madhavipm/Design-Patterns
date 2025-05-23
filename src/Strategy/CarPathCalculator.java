package Strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car path from " + source + " to " + destination);
    }
}
