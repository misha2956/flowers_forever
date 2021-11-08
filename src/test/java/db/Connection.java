package db;

import Flowers.FlowerType;

import java.util.*;

public class Connection {
    public static Connection thisConnection = null;
    Map<FlowerType, Integer> flowerTypeStats;

    private Connection() {
        flowerTypeStats = new HashMap<>();
    }

    public void submitStats(FlowerType flowerType) {
        Integer curNum = flowerTypeStats.get(flowerType);
        if (curNum == null) {
            curNum = 0;
        }
        flowerTypeStats.put(flowerType, curNum + 1);
    }

    public Map<FlowerType, Integer> getFlowerTypeStats() {
        return flowerTypeStats;
    }

    public static Connection getConnection() {
        if (thisConnection == null) {
            thisConnection = new Connection();
        }
        return thisConnection;
    }
}
