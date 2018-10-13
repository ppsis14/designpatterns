package lab9VendingMachine;

public class EndState implements State {
    TicketingMachine ticketingMachine;

    public EndState(TicketingMachine ticketingMachine) {
        this.ticketingMachine = ticketingMachine;
    }

    @Override
    public void chooseStation(String destination) {
        System.out.println("You can't choose destination station");
    }

    @Override
    public void insetCoin(double amount) {
        System.out.println("You can't insert coin");

    }

    @Override
    public void retrieveTicket() {
        ticketingMachine.dispenseTicket();
        ticketingMachine.setState(ticketingMachine.getReadyState());
    }
}
