package Strategy;

public class GoogleMaps {
    public void findPath(String source, String destination,PathType mode) {
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorMode(mode);
        pathCalculatorStrategy.findPath(source, destination);

    }
}
