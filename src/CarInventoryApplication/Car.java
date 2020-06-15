package CarInventoryApplication;

/*
Create abstract classes with some concrete and abstract methods

Create multiple subclasses

Create interfaces and implement them

Create service as well as domain entities

Create all types of nested inner classes and with right examples

Create Wrapper classes for int, float and boolean, try to do autoboxing

 */

public class Car {
    private double price;
    private String model;
    private String make;
    private int year;

    public void setPrice(double p){
        price = p;
    }

    public void setModel(String givenModel){
        model = givenModel;
    }

    public void setMake(String givenMake){
        make = givenMake;
    }

    public void setYear(int givenYear){
        year = givenYear;
    }

    public double getPrice(){
        return price;
    }

    public String getModel(){
        return model;
    }

    public String getMake(){
        return make;
    }

    public int getYear(){
        return year;
    }

}
