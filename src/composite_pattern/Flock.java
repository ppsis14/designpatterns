package composite_pattern;

import java.util.ArrayList;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();
    private int cnt = 0;
    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    @Override
    public void quack() {
        for (Quackable q : quackers){
            if (cnt != 0) q.quack();
            // check if it first duck that was add, will quack 3 times
            else {
                q.quack();
                q.quack();
                q.quack();
            }
            cnt++;
        }
    }
}
