package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */

public class Rooster implements Bird {

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public void sing() {
        System.out.println("Cock-a-doodle-doo");
    }
}
