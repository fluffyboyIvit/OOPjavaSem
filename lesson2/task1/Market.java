
package lesson2.task1;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{

    private List<Actor> queue = new ArrayList<>();
    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
    }

    @Override
    public void takeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeOrder'");
    }

    @Override
    public void giveOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'giveOrder'");
    }

    @Override
    public void releaseFromQueue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'releaseFromQueue'");
    }

    @Override
    public void AcceptToMarket(Actor actor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AcceptToMarket'");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'releaseFromMarket'");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    
}