import java.util.concurrent.ArrayBlockingQueue;

public class FestivalGate {
    private final ArrayBlockingQueue<ticketType> ticketQueue;

    public FestivalGate(int capacity) {
        this.ticketQueue = new ArrayBlockingQueue<>(capacity);
    }

    public void addTicket(ticketType ticketType) {
        try {
            ticketQueue.put(ticketType);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ticketType getTicket() throws InterruptedException {
        return ticketQueue.take();
    }

    public boolean isEmpty() {
        return ticketQueue.isEmpty();
    }
}

