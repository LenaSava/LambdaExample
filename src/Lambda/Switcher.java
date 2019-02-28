package Lambda;

public class Switcher {

    public ElectricityConcumer concumer;

    public void SwichOn() {
        System.out.println("Выключатель включен!");
        if ( concumer != null) {
            concumer.ElectricityOn();
        }
    }
}
