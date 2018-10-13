package lab9VendingMachine;

public class TicketMachineMain {
    public static void main(String[] args) {
        TicketingMachine ticketingMachine = new TicketingMachine();
        ticketingMachine.chooseStation("chatujak");

        System.out.println();
        ticketingMachine.chooseStation("Sukhumvit");
        ticketingMachine.retrieveTicket();
        System.out.println();

        ticketingMachine.insertCoin(5);
        ticketingMachine.insertCoin(15);
        ticketingMachine.insertCoin(25);

        System.out.println();
        ticketingMachine.chooseStation("Sukhumvit");
        ticketingMachine.insertCoin(25);

        System.out.println();
        ticketingMachine.retrieveTicket();
    }
}
