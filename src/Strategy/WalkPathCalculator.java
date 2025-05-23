package Strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walking path from " + source + " to " + destination);
    }
}
