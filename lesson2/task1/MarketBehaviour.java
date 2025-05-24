
package lesson2.task1;

import java.util.List;

public interface MarketBehaviour {

    public void AcceptToMarket(Actor actor);
    public void releaseFromMarket(List<Actor> actors);
    public void update();

}