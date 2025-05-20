
 package lesson1.task1;

public class bottleWater extends product {

    private int volume;



    public bottleWater(String name, int price) {
        super(name, price);
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "bottleWater{" +
                "volume = " + volume + ", name = " + getName() +
                    "}";
    }

    
}