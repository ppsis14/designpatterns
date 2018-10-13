package lab9VendingMachine;

public class ReadyState implements State {
    TicketingMachine ticketingMachine;

    public ReadyState(TicketingMachine ticketingMachine) {
        this.ticketingMachine = ticketingMachine;
        ticketingMachine.displayCurrentStation();
    }

    @Override
    public void chooseStation(String destination) {
        if (destination != null) {
            ticketingMachine.calPrice(ticketingMachine.getCurrentStation(), destination);
            ticketingMachine.setState(ticketingMachine.getPayMoneyState());
        }
    }

    @Override
    public void insetCoin(double amount) {
        System.out.println("You haven’t inserted a coin");
    }

    @Override
    public void retrieveTicket() {
        System.out.println("You haven’t choose destination station");
    }
}
