package tractor;


import machine.Machine;

public class Tractor extends Machine {
    String type;

    public Tractor(String name, double weight, double maxSpeed, int numberOfPassengers, String type) {
        super(name, weight, maxSpeed, numberOfPassengers);
        this.type = type;
    }
    public String getType() {
        return type;
    }
}


