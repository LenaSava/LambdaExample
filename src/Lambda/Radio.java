package Lambda;

public class Radio implements ElectricityConcumer {

    public void playMusic() {
        System.out.println("Radio plays");
    }

    @Override
    public void ElectricityOn() {
        playMusic();
    }
}
