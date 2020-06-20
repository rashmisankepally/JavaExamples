package Generics;
import CarInventoryApplication.Car;

import java.util.HashMap;
import java.util.Map;

public class TestGenerics {

    public static void main(String[] args) {
        MapContainer<String,Car> carContainer = new MapContainer<String, Car>();
        Map<String,Car> carMap = new HashMap<String,Car>();
        carContainer.addMapToList(carMap);

    }

}