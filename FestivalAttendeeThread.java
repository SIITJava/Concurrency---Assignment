import jdk.jfr.Timespan;

public class FestivalAttendeeThread extends Thread {
    private final ticketType ticketType;
    private final FestivalGate gate;

    public FestivalAttendeeThread(ticketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    @Override
    public void run() {
        System.out.println("Attendee arrived with " + ticketType + " ticket");
        gate.addTicket(ticketType);
    }
}
