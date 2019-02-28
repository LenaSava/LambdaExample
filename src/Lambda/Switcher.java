package Lambda;
import java.util.List;
import java.util.ArrayList;

public class Switcher {

    private List<ElectricityConcumer> listeners =  new ArrayList<>();

    public void addElectricityListener(ElectricityConcumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConcumer listener) {
        listeners.remove(listener);
    }



    public void SwichOn() {
        System.out.println("Выключатель включен!");
//        if ( concumer != null ) {
//            concumer.ElectricityOnn;
//        }
        for (ElectricityConcumer c : listeners) {
            c.ElectricityOn();
        }
    }
}
