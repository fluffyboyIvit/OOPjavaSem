
package lesson2.task1;

public interface QueueBehaviour {

    public void takeInQueue(Actor actor);
    public void takeOrder();
    public void giveOrder();
    public void releaseFromQueue();
}