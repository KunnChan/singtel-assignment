package min.challenge.singtel.model;
/*
 * Created by kunnchan on 31/07/2020
 * package :  min.challenge.singtel.model
 */

public class Butterfly implements Animal {

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
        return false;
    }

    @Override
    public boolean canSwim() {
        return false;
    }

}
