package com.company;

import bus.Bus;
import serverMachines.ServerMachines;
import tractor.Tractor;
import tractorCrawler.TractorCrawler;
import tractorWheeled.TractorWheeled;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int num;


        Bus m1;
        Tractor m2;
        TractorCrawler m3;
        TractorWheeled m4;
        ServerMachines sm = new ServerMachines(4,15);

        for(int i=0;i<15;i++) {
            num = random.nextInt(4);
            switch (num) {
                case 0:
                    m1 = new Bus("Автобус",325.00,85,35);
                    sm.addTransport(num,m1);
                    break;
                case 1:
                    m2 = new Tractor("Трактор",35,45,2,"xz");
                    sm.addTransport(num,m2);
                    break;
                case 2:
                    m3 = new TractorCrawler("Трактор гусеничный",67,35.4,2,"xz");
                    sm.addTransport(num,m3);
                    break;
                case 3:
                    m4 = new TractorWheeled("Трактор колесный",31,45.6,2,"xz");
                    sm.addTransport(num,m4);
                    break;
            }
        }

        int mach[] = sm.getCountVehicles();
        System.out.println("Автобусов: " + mach[0]);
        System.out.println("Тракторов: " + mach[1]);
        System.out.println("Тракторов гусеничных: " + mach[2]);
        System.out.println("Тракторов колесных: " + mach[3]);

    }
}
