package lab9VendingMachine;

public interface State {
    public void chooseStation(String destination);
    public void insetCoin(double amount);
    public void retrieveTicket();


}
