package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */

public class Duck extends Bird {

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    void swim() {
        System.out.println("I am swimming");
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
