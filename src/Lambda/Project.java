package Lambda;

public class Project {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

//        class Fire implements ElectricityConcumer {
//            @Override
//            public void ElectricityOn() {
//                System.out.println("Пожар!");
//            }
//        }
        sw.addElectricityListener(
                new ElectricityConcumer() {
                    @Override
                    public void ElectricityOn() {
                        System.out.println("Пожар!");
                    }
                }
        );

        sw.SwichOn();

    }
}
