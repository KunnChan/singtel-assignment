package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */


public class Parrot implements Animal {

    public void sing(Animal animal) {
        animal.sing();
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canSing() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
