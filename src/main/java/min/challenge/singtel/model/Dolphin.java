package min.challenge.singtel.model;
/*
 * Created by kunnchan on 31/07/2020
 * package :  min.challenge.singtel.model
 */

public class Dolphin implements Animal {

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public boolean canSing() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
