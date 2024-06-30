import javax.xml.datatype.DatatypeConstants;

public class FestivalStatisticsThread extends Thread {
    private final FestivalGate gate;
    private int fullTickets = 100;
    private int fullVipTickets = 50;
    private int freePasses = 10;
    private int oneDayPasses = 20;
    private int oneDayVipPasses = 20;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        while (true) {
            if (!gate.isEmpty()) {
                try {
                    ticketType ticketType = gate.getTicket();
                    switch (ticketType) {
                        case FULL:
                            fullTickets++;
                            break;
                        case FULL_VIP:
                            fullVipTickets++;
                            break;
                        case FREE_PASS:
                            freePasses++;
                            break;
                        case ONE_DAY:
                            oneDayPasses++;
                            break;
                        case ONE_DAY_VIP:
                            oneDayVipPasses++;
                            break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Print statistics every 5 seconds, ensuring mutual exclusion
            synchronized (this) {
                System.out.println("---- Festival Statistics ----");
                System.out.println(fullTickets + " people have full tickets");
                System.out.println(fullVipTickets + " have full VIP passes");
                System.out.println(freePasses + " have free passes");
                System.out.println(oneDayPasses + " have one-day passes");
                System.out.println(oneDayVipPasses + " have one-day VIP passes");

            }
            DatatypeConstants TimeUnit;
            break;
        }
    }
}

