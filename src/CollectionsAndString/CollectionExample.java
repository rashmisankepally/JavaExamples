package CollectionsAndString;
/*
Read full articles at least 5 hours each on Collections, Strings

        Use at least 3 collection class and HashMap and at least 5 methods of each class
        Use Collections classes methods
 */

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.remove(3);
        numbers.add(6);
        numbers.indexOf(2);
        System.out.println(numbers);

        HashSet hs = new HashSet();
        hs.add('a');
        hs.add('b');
        hs.add('c');
        hs.add('a');
        hs.remove('b');
        System.out.println(hs.size());
        System.out.println(hs.contains('b'));
        hs.clear();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.remove("vishal");
        System.out.println(map.size());
        System.out.println(map.get("sachin"));
        System.out.println(map.values());

    }

}
