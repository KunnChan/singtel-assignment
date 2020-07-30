package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */

public class Chicken implements Bird {

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
