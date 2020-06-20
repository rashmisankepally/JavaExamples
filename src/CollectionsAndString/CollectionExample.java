package CollectionsAndString;
/*
Read full articles at least 5 hours each on Collections, Strings

        Use at least 3 collection class and HashMap and at least 5 methods of each class
        Use Collections classes methods
 */

import java.util.ArrayList;

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

    }

}
