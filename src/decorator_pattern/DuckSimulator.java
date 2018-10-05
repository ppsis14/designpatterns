package decorator_pattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        System.out.println(">> QuackCounter -> QuackEcho");
        // add quack echo
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable gooseDuck = new QuackEcho(new GooseAdapter(new Goose()));
        Quackable pigeonDuck = new QuackEcho(new PigeonAdapter(new Pigeon()));

        System.out.println("\nDuck Simulator: With Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuack() + " Times");

        System.out.println("----------------------------------------------\n");
        System.out.println(">> QuackEcho -> QuackCounter");
        // add QuackEcho -> QuackCounter
        Quackable mallardDuck2 = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck2 = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable duckCall2 = new QuackEcho(new QuackCounter(new DuckCall()));
        Quackable rubberDuck2 = new QuackEcho(new QuackCounter(new RubberDuck()));
        Quackable gooseDuck2 = new QuackEcho(new GooseAdapter(new Goose()));
        Quackable pigeonDuck2 = new QuackEcho(new PigeonAdapter(new Pigeon()));

        simulate(mallardDuck2);
        simulate(redheadDuck2);
        simulate(duckCall2);
        simulate(rubberDuck2);
        simulate(gooseDuck2);
        simulate(pigeonDuck2);

        System.out.println("The ducks quacked " + QuackCounter.getQuack() + " Times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
