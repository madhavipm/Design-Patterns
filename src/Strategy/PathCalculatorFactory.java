package Strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorMode(Enum type){
        if(type.equals(PathType.Car)){
            return new CarPathCalculator();
        }
        else if(type.equals(PathType.Bike)){
            return new BikePathCalculator();
        }
        else if(type.equals(PathType.Walk)){
            return new WalkPathCalculator();
        }
        else{
            return null;
        }
    }
}
