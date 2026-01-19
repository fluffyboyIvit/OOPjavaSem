
package lesson1.task1;

public class hotBeverage extends product {
    private double volume;
    private int temerature;

    public hotBeverage(String name, int price) {
        super(name, price);
        //TODO Auto-generated constructor stub
        this.volume = 0.5;
    }

    public int getTemerature() {
        return temerature;
    }

    public double getVolume(){
        return volume;
    }

    public void setTemerature(int temerature) {
        this.temerature = temerature;
    }


    public void setVolume(int volume){
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format( "%s , volume %d, temperature %d",super.toString(), volume, temerature);
    }

    
    
}