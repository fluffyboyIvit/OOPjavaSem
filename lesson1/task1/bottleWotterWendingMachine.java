package lesson1.task1;

import java.util.List;

public class bottleWotterWendingMachine implements vendingMachine{

    private final List<product> productList;
    private int money;

    public bottleWotterWendingMachine(List<product> productList) {
        this.productList = productList;
    }
    @Override
    public product getProduct(String name) {
        for(product product:productList){
            if(product.getName().equals(name)){
                money+= product.getPrice();
                return product;
            }
        }
        return null;
    }
    
    public bottleWater getProduct(String name,int volume){
        for(product product:productList){
            if(product instanceof bottleWater){
                if(product.getName().equals(name)&&((bottleWater) product.getVolume()==volume){
                    return (bottleWater) product;
                }
            }
        }
        return null;
    }

    
}
