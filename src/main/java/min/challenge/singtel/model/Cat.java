package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */

public class Cat implements Animal {

    @Override
    public void sing() {
        System.out.println("Meow");
    }

    @Override
    public boolean canFly() {
        return false;
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
