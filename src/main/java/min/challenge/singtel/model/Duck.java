package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */

public class Duck implements Bird {

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    void swim() {
        System.out.println("I am swimming");
    }

}
