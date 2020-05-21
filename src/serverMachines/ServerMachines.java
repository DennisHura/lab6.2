package serverMachines;


import machine.Machine;

public class ServerMachines {
    private int[] countVehicles;
    private int commonCountVehicles;
    private int limitVehicle;
    private Machine[] vehicles;

    public ServerMachines (int size,int limit) {
        countVehicles = new int[size];
        vehicles = new Machine[limit];
        this.limitVehicle = limit;
    }

    public int getLimitVehicle () {
        return limitVehicle;
    }


    public int[] getCountVehicles() {
        return countVehicles;
    }

    public int getCurrentCountVehicle () {
        return commonCountVehicles;
    }

    public void addTransport (int numberVehicles, Machine vehicle) {
        countVehicles[numberVehicles]++;
        vehicles [commonCountVehicles] = vehicle;
        vehicles[commonCountVehicles].move();
        commonCountVehicles ++;
    }
}
