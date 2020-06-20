package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapContainer <K, V> {

    List<Map<K,V>> mapList=new ArrayList<Map<K,V>>();

    Map<K,V> map;

    public void addMapToList(Map<K,V> map){
        mapList.add(map);
    }

}