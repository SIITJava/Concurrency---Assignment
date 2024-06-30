import java.util.HashMap;

public class FestivalApp {
    public static void main(String[] args) {
        int numAttendees = 200;
        FestivalGate gate = new FestivalGate(10); // Buffer size for tickets

        // Create and start the single statistics thread
        FestivalStatisticsThread statisticsThread = new FestivalStatisticsThread(gate);
        statisticsThread.start();

        // Generate and start attendee threads (unlimited)
        for (int i = 0; i < numAttendees; i++) {
            HashMap<Object, Object> t;
            t = null;

        }
    }
}

