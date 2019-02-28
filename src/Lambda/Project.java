package Lambda;

public class Project {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();

        sw.concumer = lamp;
        sw.SwichOn();

    }
}
