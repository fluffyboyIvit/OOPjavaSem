
package lesson1.task1;
import lesson1.task1.hotBeverage;
import java.util.List;

public class hotBeverageWendingMachine implements vendingMachine {

    private final List<product> productList;
    private int money;

    public hotBeverageWendingMachine(List<product> productslList){
        this.productList = productslList;
    }
    @Override
    public product getProduct(String name) {
       for (product product : productList) {
        if (product.getName().equals(name)) {
            money+=product.getPrice();
            return product;
        }
       }
       return null;
    }
    
    public hotBeverage getProduct(String name,double volume){
        for (product product : productList) {
            if (product instanceof  hotBeverage) {
                if((product.getName()==name) && (((hotBeverage) product).getVolume()==volume)){
                    return (hotBeverage)product;
                }
            }
        }
        return null;
    }
    
}