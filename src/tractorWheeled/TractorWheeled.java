package tractorWheeled;


import tractor.Tractor;

public class TractorWheeled extends Tractor {
    public TractorWheeled(String name, double weight, double maxSpeed, int numberOfPassengers,String type) {
        super(name, weight, maxSpeed, numberOfPassengers,"Колесный");
    }
}
