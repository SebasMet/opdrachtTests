package com.company.toets;

public class Main {

    public static void main(String[] args) {
        System.out.println(permissonToFly(true, 2000, 60));
        System.out.println(costOfLanding(3000, 4, true ,false));
    }

    public static boolean permissonToFly(boolean permissionOfTower, int weightOfLoad, int headWind) {

        if(permissionOfTower && (weightOfLoad < 1000 || headWind > 50))
            return true;
        else
            return false;
    }

    public static int costOfLanding(int weightOfPlane, int passangers, boolean baggageHandling, boolean dutchOrigin) {
        int cost = 0;

        if (weightOfPlane < 1000)
            cost = 100;
        if (weightOfPlane >= 1000 && weightOfPlane < 5000)
            cost = 500;
        if (weightOfPlane >= 5000)
            cost = 2500;

        if (passangers > 2)
            cost *= 1.5;

        if (baggageHandling)
            cost += 800;

        if (dutchOrigin)
            cost *= 0.21;

        return cost;
    }
}
