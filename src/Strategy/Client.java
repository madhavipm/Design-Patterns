package Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Rjy" , "Hyd" , PathType.Car);
        googleMaps.findPath("Rjy" , "Hyd" , PathType.Bike);
        googleMaps.findPath("Rjy" , "Hyd" , PathType.Walk);
    }
}
