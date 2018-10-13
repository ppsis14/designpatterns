package lab9VendingMachine;

public class TicketingMachine {
    private State readyState;
    private State payMoneyState;
    private State endState;
    private State state;

    private String currentStation = "Mhochit";
    private String destination;
    private double totalPrice;
    private double remainCoin = 0;
    private double totalCoin = 0;

    public TicketingMachine() {
        readyState = new ReadyState(this);
        payMoneyState = new PayMoneyState(this);
        endState = new EndState(this);
        this.state = readyState;
    }

    public void setState(State state){
        this.state = state;
    }

    public void dispenseTicket(){
        System.out.println("------------ Ticket ------------");
        System.out.println("From " + currentStation + " -----> To " + destination);
        System.out.println("Total Price is : " + totalPrice + " Baht.");
        System.out.println("----------- Activate -----------");
        totalCoin = 0;
        totalPrice = 0;
        remainCoin = 0;
    }

    public void returnCoins(){
        System.out.println("Return coins : " + (totalCoin - totalPrice));
    }

    public void displayCurrentStation(){
        System.out.println("You are at : " + currentStation);
    }

    public void insertCoin(double amount){
        this.state.insetCoin(amount);
    }

    public void chooseStation(String des){
        this.state.chooseStation(des);
    }

    public void retrieveTicket(){
        this.state.retrieveTicket();
    }

    public void addCoinToPay(double amount){
        System.out.println("You inset coin : " + amount);
        totalCoin += amount;
        remainCoin = totalPrice - totalCoin;
    }

    public void displayRemainingAmount(){
        System.out.println("You have remaining amount : " + remainCoin);
    }

    public void calPrice(String currentStation, String destination){
        this.destination = destination;
        if (destination.equalsIgnoreCase("chatujak")){
            totalPrice = 30;
            System.out.println("From " + currentStation + " -----> " + destination);
            System.out.println("Total Price is : " + totalPrice + " Baht.");
        }
    }

    public String getCurrentStation() {
        return currentStation;
    }

    public State getReadyState() {
        return readyState;
    }

    public State getPayMoneyState() {
        return payMoneyState;
    }

    public State getEndState() {
        return endState;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getRemainCoin() {
        return remainCoin;
    }

    public double getTotalCoin() {
        return totalCoin;
    }
}
