package CarInventoryApplication;

/*
Create a car inventory application, where you can add, remove and update inventory,
use inheritance for various types of car, use abstraction and encapsulation.
 Also use compile time and runtime polymorphism to show different methods.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

public class CarSales {

    private final List<Car> inventory;

    public CarSales() {
        this.inventory = new LinkedList<>();
    }

    public void add(String carName, Object[] initArgs){
        try{
            Class carClass = Class.forName(carName);
            Class[] initClassArgs= new Class[initArgs.length];
            for(int i=0;i<initArgs.length;i++){
                initClassArgs[i]=initArgs[i].getClass();
            }
            Constructor carConstructor =
                    carClass.getConstructor(initClassArgs);

            Car newCar = (Car)carConstructor.newInstance(initArgs);
            inventory.add(newCar);
        }
        catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e){
            System.out.println(e);
        }

    }

    public void remove(){

    }

    public void update(){

    }

}
