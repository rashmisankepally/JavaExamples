package CarInventoryApplication;

public class TeslaCar extends Car implements ElectricChargeable{


    @Override
    public Boolean chargeable() {
        return Boolean.TRUE;
    }
}
