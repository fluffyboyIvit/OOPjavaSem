
package lesson2.task1;

import lesson1.task1.bottleWotterWendingMachine;

public interface ActorBehavoir {
    
    public void setMakeOrder(boolean makeOrder);
    public void setTakeOrder(boolean takeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();


    
}