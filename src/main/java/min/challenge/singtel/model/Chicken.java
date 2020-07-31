package min.challenge.singtel.model;
/*
 * Created by kunnchan on 30/07/2020
 * package :  min.challenge.singtel.model
 */

public class Chicken extends Bird {

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public void sing() {
        System.out.println("Cluck, cluck");
    }

}
