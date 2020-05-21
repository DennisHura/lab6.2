package tractorCrawler;


import tractor.Tractor;

public class TractorCrawler extends Tractor {
    public TractorCrawler(String name, double weight, double maxSpeed, int numberOfPassengers, String type) {
        super(name, weight, maxSpeed, numberOfPassengers, "Гусеничный");
    }
}

