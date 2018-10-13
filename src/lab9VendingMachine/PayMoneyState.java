package lab9VendingMachine;

public class PayMoneyState implements State{
    TicketingMachine ticketingMachine;

    public PayMoneyState(TicketingMachine ticketingMachine) {
        this.ticketingMachine = ticketingMachine;
        ticketingMachine.displayRemainingAmount();
    }

    @Override
    public void chooseStation(String destination) {
        System.out.println("You can't choose destination station");
    }

    @Override
    public void insetCoin(double amount) {
        ticketingMachine.addCoinToPay(amount);
        if (ticketingMachine.getTotalCoin() > ticketingMachine.getTotalPrice()){
            ticketingMachine.returnCoins();
            ticketingMachine.setState(ticketingMachine.getEndState());
        }
        else if (ticketingMachine.getTotalCoin() == ticketingMachine.getTotalPrice()){
            ticketingMachine.setState(ticketingMachine.getEndState());
        }
        else {
            System.out.println("Remaining coin : " + ticketingMachine.getRemainCoin());
            System.out.println("You coin not enough, please insert coin");
        }

    }

    @Override
    public void retrieveTicket() {
        System.out.println("You haven’t choose destination station");

    }
}
