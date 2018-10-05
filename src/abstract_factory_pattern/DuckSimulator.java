package abstract_factory_pattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory duckFactoryCounter = new CountingDuckFactory();
        AbstractDuckFactory duckFactoryCounterEcho = new CountingEchoDuckFactory();
        simulator.simulate(duckFactory);
        simulator.simulate(duckFactoryCounter);
        simulator.simulate(duckFactoryCounterEcho);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        //System.out.println("\nDuck Simulator: With Abstract Factory: No decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuack() + " Times");

        System.out.println("-------------------------------");

    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
