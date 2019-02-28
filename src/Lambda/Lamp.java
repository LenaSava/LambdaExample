package Lambda;

public class Lamp implements ElectricityConcumer {
    public void LampOn() {
        System.out.println("Лампа зажглась!");
    }
    @Override
    public void ElectricityOn() {
        LampOn();
    }

}
